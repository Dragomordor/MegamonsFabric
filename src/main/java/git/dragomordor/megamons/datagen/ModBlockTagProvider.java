package git.dragomordor.megamons.datagen;

import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {



        getOrCreateTagBuilder(ModTags.Blocks.ORE_MEGASTONES)
//                // Stone ore
//                .add(MegamonsBlocks.ORE_AERODACTYLITE)
//                .add(MegamonsBlocks.ORE_ALAKAZITE)
//                .add(MegamonsBlocks.ORE_BEEDRILLITE)
//                .add(MegamonsBlocks.ORE_BLASTOISINITE)
//                .add(MegamonsBlocks.ORE_CHARIZARDITEX)
//                .add(MegamonsBlocks.ORE_CHARIZARDITEY)
//                .add(MegamonsBlocks.ORE_GENGARITE)
//                .add(MegamonsBlocks.ORE_GYARADOSITE)
//                .add(MegamonsBlocks.ORE_KANGASKHANITE)
//                .add(MegamonsBlocks.ORE_MEWTWONITEX)
//                .add(MegamonsBlocks.ORE_MEWTWONITEY)
//                .add(MegamonsBlocks.ORE_PIDGEOTITE)
//                .add(MegamonsBlocks.ORE_PINSIRITE)
//                .add(MegamonsBlocks.ORE_SLOWBRONITE)
//                .add(MegamonsBlocks.ORE_VENUSAURITE)
//                // Deepslate ore
//                .add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE)
                // Crystal ore
                    // Gen 1
                .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE)
                    // Gen 2
                .add(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE)
                // TODO: Add Heracronite
                // TODO: Add Houndoominite
                .add(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE)
                    // Gen 3
                // TODO: Add Absolite
                // TODO: Add Aggronite
                // TODO: Add Altarianite
                .add(MegamonsBlocks.ORE_CRYSTAL_BANETTITE)
                // TODO: Add Blazikenite
                // TODO: Add Cameruptite
                .add(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_GLALITITE)
                // TODO: Add Latiasite
                // TODO: Add Latiosite
                .add(MegamonsBlocks.ORE_CRYSTAL_MAWILITE)
                // TODO: Add Manechtite
                // TODO: Add Medichamite
                // TODO: Add Metagrossite
                // TODO: Add Rayquazite
                .add(MegamonsBlocks.ORE_CRYSTAL_SABLENITE)
                // TODO: Add Salamencite
                // TODO: Add Sceptilite
                .add(MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE)
                // TODO: Add Swampertite
                    // Gen 4
                // TODO: Add Abomasite
                // TODO: Add Galladite
                .add(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE)
                // TODO: Add Lopunnite
                // TODO: Add Lucarionite
                    // Gen 5
                // TODO: Add Audinite
                    // Gen 6
                // TODO: Add Diancite
                    // Gen 7+

                ;

        getOrCreateTagBuilder(ModTags.Blocks.GEODE_WALLS)
                .add(MegamonsBlocks.ANISTARITE_GEODE_BLOCK)
                .add(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK)
                ;


       getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
               // Stone ore
//               .add(MegamonsBlocks.ORE_AERODACTYLITE)
//               .add(MegamonsBlocks.ORE_ALAKAZITE)
//               .add(MegamonsBlocks.ORE_BEEDRILLITE)
//               .add(MegamonsBlocks.ORE_BLASTOISINITE)
//               .add(MegamonsBlocks.ORE_CHARIZARDITEX)
//               .add(MegamonsBlocks.ORE_CHARIZARDITEY)
//               .add(MegamonsBlocks.ORE_GENGARITE)
//               .add(MegamonsBlocks.ORE_GYARADOSITE)
//               .add(MegamonsBlocks.ORE_KANGASKHANITE)
//               .add(MegamonsBlocks.ORE_MEWTWONITEX)
//               .add(MegamonsBlocks.ORE_MEWTWONITEY)
//               .add(MegamonsBlocks.ORE_PIDGEOTITE)
//               .add(MegamonsBlocks.ORE_PINSIRITE)
//               .add(MegamonsBlocks.ORE_SLOWBRONITE)
//               .add(MegamonsBlocks.ORE_VENUSAURITE)
//               // Deepslate ore
//               .add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE)
//               .add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE)
               // Crystal ore
               // Gen 1
               .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX)
               .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY)
               .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX)
               .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY)
               .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE)
               // Gen 2
               .add(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE)
               // TODO: Add Heracronite
               // TODO: Add Houndoominite
               .add(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE)
               // Gen 3
               // TODO: Add Absolite
               // TODO: Add Aggronite
               // TODO: Add Altarianite
               .add(MegamonsBlocks.ORE_CRYSTAL_BANETTITE)
               // TODO: Add Blazikenite
               // TODO: Add Cameruptite
               .add(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE)
               .add(MegamonsBlocks.ORE_CRYSTAL_GLALITITE)
               // TODO: Add Latiasite
               // TODO: Add Latiosite
               .add(MegamonsBlocks.ORE_CRYSTAL_MAWILITE)
               // TODO: Add Manechtite
               // TODO: Add Medichamite
               // TODO: Add Metagrossite
               // TODO: Add Rayquazite
               .add(MegamonsBlocks.ORE_CRYSTAL_SABLENITE)
               // TODO: Add Salamencite
               // TODO: Add Sceptilite
               .add(MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE)
               // TODO: Add Swampertite
               // Gen 4
               // TODO: Add Abomasite
               // TODO: Add Galladite
               .add(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE)
               // TODO: Add Lopunnite
               // TODO: Add Lucarionite
               // Gen 5
               // TODO: Add Audinite
               // Gen 6
               // TODO: Add Diancite
               // Gen 7+

               // Geode Crystal Evo ores
               .add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE)
               .add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE)

                // Megastone Geode Block
               .add(MegamonsBlocks.ANISTARITE_GEODE_BLOCK)
               .add(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK)

            ;



        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

            ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                // Megastone Geode Block
                .add(MegamonsBlocks.ANISTARITE_GEODE_BLOCK)
                .add(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK)

                // Geode Crystal Evo ores
                .add(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE)
                .add(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE)
            ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                // Stone ore
//                .add(MegamonsBlocks.ORE_AERODACTYLITE)
//                .add(MegamonsBlocks.ORE_ALAKAZITE)
//                .add(MegamonsBlocks.ORE_BEEDRILLITE)
//                .add(MegamonsBlocks.ORE_BLASTOISINITE)
//                .add(MegamonsBlocks.ORE_CHARIZARDITEX)
//                .add(MegamonsBlocks.ORE_CHARIZARDITEY)
//                .add(MegamonsBlocks.ORE_GENGARITE)
//                .add(MegamonsBlocks.ORE_GYARADOSITE)
//                .add(MegamonsBlocks.ORE_KANGASKHANITE)
//                .add(MegamonsBlocks.ORE_MEWTWONITEX)
//                .add(MegamonsBlocks.ORE_MEWTWONITEY)
//                .add(MegamonsBlocks.ORE_PIDGEOTITE)
//                .add(MegamonsBlocks.ORE_PINSIRITE)
//                .add(MegamonsBlocks.ORE_SLOWBRONITE)
//                .add(MegamonsBlocks.ORE_VENUSAURITE)
//                // Deepslate ore
//                .add(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE)
//                .add(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE)
                // Crystal ore
                // Gen 1
                .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX)
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY)
                .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE)
                // Gen 2
                .add(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE)
                // TODO: Add Heracronite
                // TODO: Add Houndoominite
                .add(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE)
                // Gen 3
                // TODO: Add Absolite
                // TODO: Add Aggronite
                // TODO: Add Altarianite
                .add(MegamonsBlocks.ORE_CRYSTAL_BANETTITE)
                // TODO: Add Blazikenite
                // TODO: Add Cameruptite
                .add(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE)
                .add(MegamonsBlocks.ORE_CRYSTAL_GLALITITE)
                // TODO: Add Latiasite
                // TODO: Add Latiosite
                .add(MegamonsBlocks.ORE_CRYSTAL_MAWILITE)
                // TODO: Add Manechtite
                // TODO: Add Medichamite
                // TODO: Add Metagrossite
                // TODO: Add Rayquazite
                .add(MegamonsBlocks.ORE_CRYSTAL_SABLENITE)
                // TODO: Add Salamencite
                // TODO: Add Sceptilite
                .add(MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE)
                // TODO: Add Swampertite
                // Gen 4
                // TODO: Add Abomasite
                // TODO: Add Galladite
                .add(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE)
                // TODO: Add Lopunnite
                // TODO: Add Lucarionite
                // Gen 5
                // TODO: Add Audinite
                // Gen 6
                // TODO: Add Diancite
                // Gen 7+

                ;


    }
}
