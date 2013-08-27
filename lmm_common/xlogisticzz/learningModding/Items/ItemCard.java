package xlogisticzz.learningModding.Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import xlogisticzz.learningModding.LearningModdingCreativeTab;
import xlogisticzz.learningModding.Blocks.ModBlocks;
import xlogisticzz.learningModding.Lib.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCard extends Item {

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    public ItemCard(int par1) {
        super(par1);
        this.setCreativeTab(LearningModdingCreativeTab.tabLearningModding);
        this.setHasSubtypes(true);

    }

    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return Constants.UnLocalisedNames.CARD + itemstack.getMaxDamage();

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register) {
        icons = new Icon[Constants.Icons.CARD_ICONS.length];

        for (int i = 0; i < icons.length; i++) {
            icons[i] = register.registerIcon(Constants.Mod.MODID + ":" + Constants.Icons.CARD_ICONS[i]);

        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int damage) {
        return icons[damage];
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(int id, CreativeTabs tab, List list) {
        for (int i = 0; i < Constants.ItemNames.CARD_NAMES.length; i++) {
            list.add(new ItemStack(id, 1, i));
        }
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ) {
        if (!world.isRemote && world.getBlockId(x, y, z) == ModBlocks.machineblock.blockID) {
            int meta = world.getBlockMetadata(x, y, z);

            int disabled = meta % 2;

            int type = stack.getItemDamage() + 1;

            int newMeta = type * 2 + disabled;

            world.setBlockMetadataWithNotify(x, y, z, newMeta, 3);

            if (!player.capabilities.isCreativeMode) {
                stack.stackSize--;
            }
            return true;
        } else {
            return false;
        }
    }
}
