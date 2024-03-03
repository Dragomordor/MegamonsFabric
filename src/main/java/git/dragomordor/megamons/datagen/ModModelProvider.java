package git.dragomordor.megamons.datagen;

import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.item.MegamonsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    // Blocks
//        // Stone Ore -Megastone
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_AERODACTYLITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_ALAKAZITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_BEEDRILLITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_BLASTOISINITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CHARIZARDITEX);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CHARIZARDITEY);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_GENGARITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_GYARADOSITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_KANGASKHANITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_MEWTWONITEX);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_MEWTWONITEY);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_PIDGEOTITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_PINSIRITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_SLOWBRONITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_VENUSAURITE);
//        // Deepslate Ore -Megastone
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE);
//        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE);
        // Crystal Ore -Megastone
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_GENGARITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE);
        // Geode Crystal Evo ores
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE);



        // Megastone Geode Block
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ANISTARITE_GEODE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        // KeyStoneItem
        itemModelGenerator.register(MegamonsItems.KEY_STONE, Models.GENERATED);

        // RawMegaStoneItems
            // Gen 1
        itemModelGenerator.register(MegamonsItems.RAW_AERODACTYLITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_ALAKAZITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_BEEDRILLITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_BLASTOISINITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_CHARIZARDITEX, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_CHARIZARDITEY, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_GENGARITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_GYARADOSITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_KANGASKHANITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_MEWTWONITEX, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_MEWTWONITEY, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_PIDGEOTITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_PINSIRITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_SLOWBRONITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_VENUSAURITE, Models.GENERATED);
            // Gen 2
        itemModelGenerator.register(MegamonsItems.RAW_AMPHAROSITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_BANETTITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_GARCHOMPITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_GARDEVOIRITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_GLALITITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_MAWILITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_SABLENITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_SCIZORITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_SHARPEDONITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_STEELIXITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.RAW_TYRANITARITE, Models.GENERATED);
            // Gen 3


        // CutMegaStoneItems
            // Gen 1
        itemModelGenerator.register(MegamonsItems.CUT_AERODACTYLITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_ALAKAZITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_BEEDRILLITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_BLASTOISINITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_CHARIZARDITEX, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_CHARIZARDITEY, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_GENGARITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_GYARADOSITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_KANGASKHANITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_MEWTWONITEX, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_MEWTWONITEY, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_PIDGEOTITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_PINSIRITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_SLOWBRONITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_VENUSAURITE, Models.GENERATED);
            // Gen 2
        itemModelGenerator.register(MegamonsItems.CUT_AMPHAROSITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_BANETTITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_GARCHOMPITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_GARDEVOIRITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_GLALITITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_MAWILITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_SABLENITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_SCIZORITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_SHARPEDONITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_STEELIXITE, Models.GENERATED);
        itemModelGenerator.register(MegamonsItems.CUT_TYRANITARITE, Models.GENERATED);
            // Gen 3


        // MegaCuffItem
        itemModelGenerator.register(MegamonsItems.MEGA_CUFF, Models.GENERATED);

    }
}
