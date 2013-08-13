package xlogisticzz.learningModding.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.common.MinecraftForge;
import xlogisticzz.learningModding.creativeTab.CreativeTab;
import xlogisticzz.learningModding.lib.Constants;
import xlogisticzz.learningModding.lib.Ids;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class ModBlocks {

    // Mod Blocks
    public static OreBlock titaniumore;
    public static OreBlock rubyore;
    public static OreStorageBlock titaniumblock;
    public static OreStorageBlock rubyblock;

    public static void init() {
        titaniumore = new OreBlock(Ids.TITANIUMORE, 3,
                Block.soundStoneFootstep, "titaniumOre",
                CreativeTab.tabLearningModding, "titanium_ore");
        rubyore = new OreBlock(Ids.RUBYORE, 1, Block.soundLadderFootstep,
                "rubyOre", CreativeTab.tabLearningModding, "ruby_ore");
        titaniumblock = new OreStorageBlock(Ids.TITANIUMBLOCK,
                Block.soundMetalFootstep, CreativeTab.tabLearningModding, 6.0F,
                12.0F, "titaniumBlock", "titanium_block");
        rubyblock = new OreStorageBlock(Ids.RUBYBLOCK,
                Block.soundMetalFootstep, CreativeTab.tabLearningModding, 5.0F,
                10.0F, "rubyBlock", "ruby_block");

        // Titanium Ore Details
        LanguageRegistry.addName(titaniumore, Constants.BLOCKS.TITANIUMORENAME);
        MinecraftForge.setBlockHarvestLevel(titaniumore, "pickaxe", 3);
        GameRegistry.registerBlock(titaniumore, "titaniumOre");

        // Ruby Ore Details
        LanguageRegistry.addName(rubyore, Constants.BLOCKS.RUBYORENAME);
        MinecraftForge.setBlockHarvestLevel(rubyore, "pickaxe", 2);
        GameRegistry.registerBlock(rubyore, "rubyOre");

        // Titanium Block Details
        LanguageRegistry.addName(titaniumblock,
                Constants.BLOCKS.TITANIUMBLOCKNAME);
        MinecraftForge.setBlockHarvestLevel(titaniumblock, "pickaxe", 3);
        GameRegistry.registerBlock(titaniumblock, "titaniumBlock");

        // Ruby Block Details
        LanguageRegistry.addName(rubyblock, Constants.BLOCKS.RUBYBLOCKNAME);
        MinecraftForge.setBlockHarvestLevel(rubyblock, "pickaxe", 2);
        GameRegistry.registerBlock(rubyblock, "rubyBlock");

    }

}
