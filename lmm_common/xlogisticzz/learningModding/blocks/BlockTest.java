package xlogisticzz.learningModding.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import xlogisticzz.learningModding.LearningModdingCreativeTab;
import xlogisticzz.learningModding.Lib.Constants;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/**
 * Learning Modding Mod
 * 
 * @author xLoGisTicZz.
 * 
 *         Some code may be from tutorials.
 * 
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class BlockTest extends Block {
    
    private Icon[] icons;
    
    public BlockTest(int par1) {
    
        super(par1, Material.iron);
        this.setCreativeTab(LearningModdingCreativeTab.tabLearningModding);
        this.setUnlocalizedName(Constants.UnLocalisedNames.TEST_BLOCK);
        
    }
    
    @Override
    public boolean renderAsNormalBlock() {
    
        return false;
    }
    
    @Override
    public Icon getIcon(int side, int meta) {
    
        switch (side) {
        
            case 0 :
                return icons[0];
                
            case 1 :
                return icons[1];
                
            case 2 :
                return icons[2];
                
            case 3 :
                return icons[3];
                
            case 4 :
                return icons[4];
                
            case 5 :
                return icons[5];
                
            default :
                return icons[0];
        }
    }
    
    @Override
    public Icon getBlockTexture(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
    
        switch (par5) {
        
        // bottom
            case 0 :
                return icons[0];
                // top
            case 1 :
                return icons[1];
                // ?
            case 2 :
                return icons[2];
                // ?
            case 3 :
                return icons[3];
                // ?
            case 4 :
                return icons[4];
                // ?
            case 5 :
                return icons[5];
            default :
                
                return icons[0];
        }
    }
    
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister) {
    
        icons = new Icon[6];
        
        for (int i = 0; i < Constants.Icons.TEST.length; i++){
            icons[i] = par1IconRegister.registerIcon(Constants.Mod.MODID + ":glass/" + Constants.Icons.TEST[i]);
        }
    }
    
}
