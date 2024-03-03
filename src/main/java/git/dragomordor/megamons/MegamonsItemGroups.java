package git.dragomordor.megamons;

import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.item.MegamonsItems;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class MegamonsItemGroups {

    public static final ItemGroup MEGAMONS_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MegamonsMod.MODID, "megamons_itemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup."+MegamonsMod.MODID))
                    .icon(() -> new ItemStack(MegamonsItems.KEY_STONE)).entries((displayContext, entries) -> {

                        // Items
//                        // Metal detector
//                        entries.add(MegamonsItems.METAL_DETECTOR);
                        // KeyStoneItem
                        entries.add(MegamonsItems.KEY_STONE);
                        // MegaCuffItem
                        entries.add(MegamonsItems.MEGA_CUFF);
                        // RawMegaStoneItems
                            // Gen 1
                        entries.add(MegamonsItems.RAW_AERODACTYLITE);
                        entries.add(MegamonsItems.RAW_ALAKAZITE);
                        entries.add(MegamonsItems.RAW_BEEDRILLITE);
                        entries.add(MegamonsItems.RAW_BLASTOISINITE);
                        entries.add(MegamonsItems.RAW_CHARIZARDITEX);
                        entries.add(MegamonsItems.RAW_CHARIZARDITEY);
                        entries.add(MegamonsItems.RAW_GENGARITE);
                        entries.add(MegamonsItems.RAW_GYARADOSITE);
                        entries.add(MegamonsItems.RAW_KANGASKHANITE);
                        entries.add(MegamonsItems.RAW_MEWTWONITEX);
                        entries.add(MegamonsItems.RAW_MEWTWONITEY);
                        entries.add(MegamonsItems.RAW_PIDGEOTITE);
                        entries.add(MegamonsItems.RAW_PINSIRITE);
                        entries.add(MegamonsItems.RAW_SLOWBRONITE);
                        entries.add(MegamonsItems.RAW_VENUSAURITE);
                            // Gen 2
                        entries.add(MegamonsItems.RAW_AMPHAROSITE);
                        // TODO: Add Heracroite
                        // TODO: Add Houndoominite
                        entries.add(MegamonsItems.RAW_SCIZORITE);
                        entries.add(MegamonsItems.RAW_STEELIXITE);
                        entries.add(MegamonsItems.RAW_TYRANITARITE);
                        // Gen 3
                        // TODO: Add Absolite
                        // TODO: Add Aggronite
                        // TODO: Add Altarianite
                        entries.add(MegamonsItems.RAW_BANETTITE);
                        // TODO: Add Blazikenite
                        // TODO: Add Cameruptite
                        entries.add(MegamonsItems.RAW_GARDEVOIRITE);
                        entries.add(MegamonsItems.RAW_GLALITITE);
                        // TODO: Add Latiasite
                        // TODO: Add Latiosite
                        entries.add(MegamonsItems.RAW_MAWILITE);
                        // TODO: Add Manechtite
                        // TODO: Add Medichamite
                        // TODO: Add Metagrossite
                        // TODO: Add Rayquazite
                        entries.add(MegamonsItems.RAW_SABLENITE);
                        // TODO: Add Salamencite
                        // TODO: Add Sceptilite
                        entries.add(MegamonsItems.RAW_SHARPEDONITE);
                        // TODO: Add Swampertite
                        // Gen 4
                        // TODO: Add Abomasite
                        // TODO: Add Galladite
                        entries.add(MegamonsItems.RAW_GARCHOMPITE);
                        // TODO: Add Lopunnite
                        // TODO: Add Lucarionite
                        // Gen 5
                        // TODO: Add Audinite
                        // Gen 6
                        // TODO: Add Diancite
                        // Gen 7+


                        // CutMegaStoneItems
                        // Gen 1
                        entries.add(MegamonsItems.CUT_AERODACTYLITE);
                        entries.add(MegamonsItems.CUT_ALAKAZITE);
                        entries.add(MegamonsItems.CUT_BEEDRILLITE);
                        entries.add(MegamonsItems.CUT_BLASTOISINITE);
                        entries.add(MegamonsItems.CUT_CHARIZARDITEX);
                        entries.add(MegamonsItems.CUT_CHARIZARDITEY);
                        entries.add(MegamonsItems.CUT_GENGARITE);
                        entries.add(MegamonsItems.CUT_GYARADOSITE);
                        entries.add(MegamonsItems.CUT_KANGASKHANITE);
                        entries.add(MegamonsItems.CUT_MEWTWONITEX);
                        entries.add(MegamonsItems.CUT_MEWTWONITEY);
                        entries.add(MegamonsItems.CUT_PIDGEOTITE);
                        entries.add(MegamonsItems.CUT_PINSIRITE);
                        entries.add(MegamonsItems.CUT_SLOWBRONITE);
                        entries.add(MegamonsItems.CUT_VENUSAURITE);
                        // Gen 2
                        entries.add(MegamonsItems.CUT_AMPHAROSITE);
                        // TODO: Add Heracroite
                        // TODO: Add Houndoominite
                        entries.add(MegamonsItems.CUT_SCIZORITE);
                        entries.add(MegamonsItems.CUT_STEELIXITE);
                        entries.add(MegamonsItems.CUT_TYRANITARITE);
                        // Gen 3
                        // TODO: Add Absolite
                        // TODO: Add Aggronite
                        // TODO: Add Altarianite
                        entries.add(MegamonsItems.CUT_BANETTITE);
                        // TODO: Add Blazikenite
                        // TODO: Add Cameruptite
                        entries.add(MegamonsItems.CUT_GARDEVOIRITE);
                        entries.add(MegamonsItems.CUT_GLALITITE);
                        // TODO: Add Latiasite
                        // TODO: Add Latiosite
                        entries.add(MegamonsItems.CUT_MAWILITE);
                        // TODO: Add Manechtite
                        // TODO: Add Medichamite
                        // TODO: Add Metagrossite
                        // TODO: Add Rayquazite
                        entries.add(MegamonsItems.CUT_SABLENITE);
                        // TODO: Add Salamencite
                        // TODO: Add Sceptilite
                        entries.add(MegamonsItems.CUT_SHARPEDONITE);
                        // TODO: Add Swampertite
                        // Gen 4
                        // TODO: Add Abomasite
                        // TODO: Add Galladite
                        entries.add(MegamonsItems.CUT_GARCHOMPITE);
                        // TODO: Add Lopunnite
                        // TODO: Add Lucarionite
                        // Gen 5
                        // TODO: Add Audinite
                        // Gen 6
                        // TODO: Add Diancite
                        // Gen 7+


                    // Blocks
//                        // Stone ore
//                        entries.add(MegamonsBlocks.ORE_AERODACTYLITE);
//                        entries.add(MegamonsBlocks.ORE_ALAKAZITE);
//                        entries.add(MegamonsBlocks.ORE_BEEDRILLITE);
//                        entries.add(MegamonsBlocks.ORE_BLASTOISINITE);
//                        entries.add(MegamonsBlocks.ORE_CHARIZARDITEX);
//                        entries.add(MegamonsBlocks.ORE_CHARIZARDITEY);
//                        entries.add(MegamonsBlocks.ORE_GENGARITE);
//                        entries.add(MegamonsBlocks.ORE_GYARADOSITE);
//                        entries.add(MegamonsBlocks.ORE_KANGASKHANITE);
//                        entries.add(MegamonsBlocks.ORE_MEWTWONITEX);
//                        entries.add(MegamonsBlocks.ORE_MEWTWONITEY);
//                        entries.add(MegamonsBlocks.ORE_PIDGEOTITE);
//                        entries.add(MegamonsBlocks.ORE_PINSIRITE);
//                        entries.add(MegamonsBlocks.ORE_SLOWBRONITE);
//                        entries.add(MegamonsBlocks.ORE_VENUSAURITE);
//                        // Deepslate ore
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE);
//                        entries.add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE);
                    // Crystal blocks
                        // Megastone Geode wall
                        entries.add(MegamonsBlocks.ANISTARITE_GEODE_BLOCK);
                        entries.add(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK);

                        // Crystal ore
                            // Gen 1
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE);
                            // Gen 2
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE);
                        // TODO: Add Heracroite
                        // TODO: Add Houndoominite
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE);
                        // Gen 3
                        // TODO: Add Absolite
                        // TODO: Add Aggronite
                        // TODO: Add Altarianite
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_BANETTITE);
                        // TODO: Add Blazikenite
                        // TODO: Add Cameruptite
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE);
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_GLALITITE);
                        // TODO: Add Latiasite
                        // TODO: Add Latiosite
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_MAWILITE);
                        // TODO: Add Manechtite
                        // TODO: Add Medichamite
                        // TODO: Add Metagrossite
                        // TODO: Add Rayquazite
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_SABLENITE);
                        // TODO: Add Swampertite
                        // Gen 4
                        // TODO: Add Abomasite
                        // TODO: Add Galladite
                        entries.add(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE);
                        // TODO: Add Lopunnite
                        // TODO: Add Lucarionite
                        // Gen 5
                        // TODO: Add Audinite
                        // Gen 6
                        // TODO: Add Diancite
                        // Gen 7+


                        // Geode Crystal Evo ores
                        entries.add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE);
                        entries.add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE);



                    }).build());

    public static void registerItemGroups() {
        MegamonsMod.LOGGER.info("Registering Item Groups for " + MegamonsMod.MODID);

    }


}
