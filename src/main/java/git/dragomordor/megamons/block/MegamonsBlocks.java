package git.dragomordor.megamons.block;

import com.cobblemon.mod.common.CobblemonBlocks;
import git.dragomordor.megamons.MegamonsMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class MegamonsBlocks {
    // Megastone ore blocks
//    // Stone Ore - Megastones
//    public static final Block ORE_AERODACTYLITE = registerBlock("aerodactylite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_ALAKAZITE = registerBlock("alakazite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_BEEDRILLITE = registerBlock("beedrillite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_BLASTOISINITE = registerBlock("blastoisinite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_CHARIZARDITEX = registerBlock("charizarditex_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_CHARIZARDITEY = registerBlock("charizarditey_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_GENGARITE = registerBlock("gengarite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_GYARADOSITE = registerBlock("gyaradosite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_KANGASKHANITE = registerBlock("kangaskhanite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_MEWTWONITEX = registerBlock("mewtwonitex_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_MEWTWONITEY = registerBlock("mewtwonitey_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_PIDGEOTITE = registerBlock("pidgeotite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_PINSIRITE = registerBlock("pinsirite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_SLOWBRONITE = registerBlock("slowbronite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//    public static final Block ORE_VENUSAURITE = registerBlock("venusaurite_stone_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(4.5F,3.0F), UniformIntProvider.create(5,9)));
//
//    // Deepslate Ore - Megastones
//    public static final Block ORE_DEEPSLATE_AERODACTYLITE = registerBlock("aerodactylite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_ALAKAZITE = registerBlock("alakazite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_BEEDRILLITE = registerBlock("beedrillite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_BLASTOISINITE = registerBlock("blastoisinite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_CHARIZARDITEX = registerBlock("charizarditex_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_CHARIZARDITEY = registerBlock("charizarditey_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_GENGARITE = registerBlock("gengarite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_GYARADOSITE = registerBlock("gyaradosite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_KANGASKHANITE = registerBlock("kangaskhanite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_MEWTWONITEX = registerBlock("mewtwonitex_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_MEWTWONITEY = registerBlock("mewtwonitey_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_PIDGEOTITE = registerBlock("pidgeotite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_PINSIRITE = registerBlock("pinsirite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_SLOWBRONITE = registerBlock("slowbronite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
//    public static final Block ORE_DEEPSLATE_VENUSAURITE = registerBlock("venusaurite_deepslate_ore",
//            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));

    // Crystal Ore - Megastone
        // Gen 1
    public static final Block ORE_CRYSTAL_AERODACTYLITE = registerBlock("aerodactylite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_ALAKAZITE = registerBlock("alakazite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_BEEDRILLITE = registerBlock("beedrillite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_BLASTOISINITE = registerBlock("blastoisinite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_CHARIZARDITEX = registerBlock("charizarditex_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_CHARIZARDITEY = registerBlock("charizarditey_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_GENGARITE = registerBlock("gengarite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_GYARADOSITE = registerBlock("gyaradosite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_KANGASKHANITE = registerBlock("kangaskhanite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_MEWTWONITEX = registerBlock("mewtwonitex_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_MEWTWONITEY = registerBlock("mewtwonitey_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_PIDGEOTITE = registerBlock("pidgeotite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_PINSIRITE = registerBlock("pinsirite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_SLOWBRONITE = registerBlock("slowbronite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_VENUSAURITE = registerBlock("venusaurite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // Gen 2
    public static final Block ORE_CRYSTAL_AMPHAROSITE = registerBlock("ampharosite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // TODO: Add Heracroite
        // TODO: Add Houndoominite
    public static final Block ORE_CRYSTAL_SCIZORITE = registerBlock("scizorite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_STEELIXITE = registerBlock("steelixite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_TYRANITARITE = registerBlock("tyranitarite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite
    public static final Block ORE_CRYSTAL_BANETTITE = registerBlock("banettite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // TODO: Add Blazikenite
        // TODO: Add Cameruptite
    public static final Block ORE_CRYSTAL_GARDEVOIRITE = registerBlock("gardevoirite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block ORE_CRYSTAL_GLALITITE = registerBlock("glalitite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // TODO: Add Latiasite
        // TODO: Add Latiosite
    public static final Block ORE_CRYSTAL_MAWILITE = registerBlock("mawilite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite
        public static final Block ORE_CRYSTAL_SABLENITE = registerBlock("sablenite_crystal_ore",
                new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // TODO: Add Salamencite
        // TODO: Add Sceptilite
    public static final Block ORE_CRYSTAL_SHARPEDONITE = registerBlock("sharpedonite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite
        // TODO: Add Galladite
    public static final Block ORE_CRYSTAL_GARCHOMPITE = registerBlock("garchompite_crystal_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+


    // Geode Crystal Evo ores
    public static final Block CRYSTAL_DAWN_STONE_ORE = registerBlock("crystal_dawn_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.DAWN_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_DUSK_STONE_ORE = registerBlock("crystal_dusk_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.DUSK_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_FIRE_STONE_ORE = registerBlock("crystal_fire_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.FIRE_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_ICE_STONE_ORE = registerBlock("crystal_ice_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.ICE_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_LEAF_STONE_ORE = registerBlock("crystal_leaf_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.LEAF_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_MOON_STONE_ORE = registerBlock("crystal_moon_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.MOON_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_SHINY_STONE_ORE = registerBlock("crystal_shiny_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.SHINY_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_SUN_STONE_ORE = registerBlock("crystal_sun_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.SUN_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_THUNDER_STONE_ORE = registerBlock("crystal_thunder_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.THUNDER_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));
    public static final Block CRYSTAL_WATER_STONE_ORE = registerBlock("crystal_water_stone_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(CobblemonBlocks.WATER_STONE_ORE).strength(5.5F,3.5F).luminance(8), UniformIntProvider.create(5,9)));

    // Megastone Geode Block
        // inner crystal block
    public static final Block ANISTARITE_GEODE_BLOCK = registerBlock("anistarite_geode_block",
            new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK).strength(5.5F,3.5F).luminance(8)));
        // outer shell block
        public static final Block ANISTARITE_ROUGH_GEODE_BLOCK = registerBlock("anistarite_rough_geode_block",
                new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(6.0F,4.0F).luminance(4)));

    // Helper Methods
    // registerDefault Block
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(MegamonsMod.MODID, name), block);
    }

    // register Default BlockItem
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(MegamonsMod.MODID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    // Register all blocks
    public static void registerMegastonesBlocks() {
        MegamonsMod.LOGGER.info("Registering Mod Blocks for "+ MegamonsMod.MODID);
    }

}
