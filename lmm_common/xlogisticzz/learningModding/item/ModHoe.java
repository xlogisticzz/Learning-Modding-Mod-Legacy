package xlogisticzz.learningModding.item;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemHoe;
import xlogisticzz.learningModding.lib.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModHoe extends ItemHoe {

    public String name;

    public ModHoe(int par1, EnumToolMaterial par2EnumToolMaterial, CreativeTabs par3, int par4, String par5, String par6) {
        super(par1, par2EnumToolMaterial);
        this.setCreativeTab(par3);
        this.setMaxDamage(par4);
        this.setMaxStackSize(1);
        this.setUnlocalizedName(par5);
        name = par6;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister reg) {

        itemIcon = reg.registerIcon(Constants.Mod.MODID + ":" + name);

    }

}