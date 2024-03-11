package git.dragomordor.megamons.datagen;

import com.cobblemon.mod.common.api.tags.CobblemonBiomeTags;
import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.item.MegamonsItems;
import git.dragomordor.megamons.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ModTags.Items.CUT_MEGASTONES)
                // Gen 1
                .add(MegamonsItems.CUT_AERODACTYLITE)
                .add(MegamonsItems.CUT_ALAKAZITE)
                .add(MegamonsItems.CUT_BEEDRILLITE)
                .add(MegamonsItems.CUT_BLASTOISINITE)
                .add(MegamonsItems.CUT_CHARIZARDITEX)
                .add(MegamonsItems.CUT_CHARIZARDITEY)
                .add(MegamonsItems.CUT_GENGARITE)
                .add(MegamonsItems.CUT_GYARADOSITE)
                .add(MegamonsItems.CUT_KANGASKHANITE)
                .add(MegamonsItems.CUT_MEWTWONITEX)
                .add(MegamonsItems.CUT_MEWTWONITEY)
                .add(MegamonsItems.CUT_PIDGEOTITE)
                .add(MegamonsItems.CUT_PINSIRITE)
                .add(MegamonsItems.CUT_SLOWBRONITE)
                .add(MegamonsItems.CUT_VENUSAURITE)
                // Gen 2
                .add(MegamonsItems.CUT_AMPHAROSITE)
                // TODO: Add Heracroite
                // TODO: Add Houndoominite
                .add(MegamonsItems.CUT_SCIZORITE)
                .add(MegamonsItems.CUT_STEELIXITE)
                .add(MegamonsItems.CUT_TYRANITARITE)
                // Gen 3
                // TODO: Add Absolite
                // TODO: Add Aggronite
                // TODO: Add Altarianite
                .add(MegamonsItems.CUT_BANETTITE)
                // TODO: Add Blazikenite
                // TODO: Add Cameruptite
                .add(MegamonsItems.CUT_GARDEVOIRITE)
                .add(MegamonsItems.CUT_GLALITITE)
                // TODO: Add Latiasite
                // TODO: Add Latiosite
                .add(MegamonsItems.CUT_MAWILITE)
                // TODO: Add Manechtite
                // TODO: Add Medichamite
                // TODO: Add Metagrossite
                // TODO: Add Rayquazite
                .add(MegamonsItems.CUT_SABLENITE)
                // TODO: Add Salamencite
                // TODO: Add Sceptilite
                .add(MegamonsItems.CUT_SHARPEDONITE)
                // TODO: Add Swampertite
                // Gen 4
                // TODO: Add Abomasite
                .add(MegamonsItems.CUT_GALLADITE)
                .add(MegamonsItems.CUT_GARCHOMPITE)
                // TODO: Add Lopunnite
                // TODO: Add Lucarionite
                // Gen 5
                // TODO: Add Audinite
                // Gen 6
                // TODO: Add Diancite
                // Gen 7+

                ;

        getOrCreateTagBuilder(ModTags.Items.RAW_MEGASTONES)
                // Gen 1
                .add(MegamonsItems.RAW_AERODACTYLITE)
                .add(MegamonsItems.RAW_ALAKAZITE)
                .add(MegamonsItems.RAW_BEEDRILLITE)
                .add(MegamonsItems.RAW_BLASTOISINITE)
                .add(MegamonsItems.RAW_CHARIZARDITEX)
                .add(MegamonsItems.RAW_CHARIZARDITEY)
                .add(MegamonsItems.RAW_GENGARITE)
                .add(MegamonsItems.RAW_GYARADOSITE)
                .add(MegamonsItems.RAW_KANGASKHANITE)
                .add(MegamonsItems.RAW_MEWTWONITEX)
                .add(MegamonsItems.RAW_MEWTWONITEY)
                .add(MegamonsItems.RAW_PIDGEOTITE)
                .add(MegamonsItems.RAW_PINSIRITE)
                .add(MegamonsItems.RAW_SLOWBRONITE)
                .add(MegamonsItems.RAW_VENUSAURITE)
                // Gen 2
                .add(MegamonsItems.RAW_AMPHAROSITE)
                // TODO: Add Heracroite
                // TODO: Add Houndoominite
                .add(MegamonsItems.RAW_SCIZORITE)
                .add(MegamonsItems.RAW_STEELIXITE)
                .add(MegamonsItems.RAW_TYRANITARITE)
                // Gen 3
                // TODO: Add Absolite
                // TODO: Add Aggronite
                // TODO: Add Altarianite
                .add(MegamonsItems.RAW_BANETTITE)
                // TODO: Add Blazikenite
                // TODO: Add Cameruptite
                .add(MegamonsItems.RAW_GARDEVOIRITE)
                .add(MegamonsItems.RAW_GLALITITE)
                // TODO: Add Latiasite
                // TODO: Add Latiosite
                .add(MegamonsItems.RAW_MAWILITE)
                // TODO: Add Manechtite
                // TODO: Add Medichamite
                // TODO: Add Metagrossite
                // TODO: Add Rayquazite
                .add(MegamonsItems.RAW_SABLENITE)
                // TODO: Add Salamencite
                // TODO: Add Sceptilite
                .add(MegamonsItems.RAW_SHARPEDONITE)
                // TODO: Add Swampertite
                // Gen 4
                // TODO: Add Abomasite
                .add(MegamonsItems.RAW_GALLADITE)
                .add(MegamonsItems.RAW_GARCHOMPITE)
                // TODO: Add Lopunnite
                // TODO: Add Lucarionite
                // Gen 5
                // TODO: Add Audinite
                // Gen 6
                // TODO: Add Diancite
                // Gen 7+

                ;

        getOrCreateTagBuilder(ModTags.Items.ORE_MEGASTONES)
                // Gen 1
                .add(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_GENGARITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE.asItem())
                // Gen 2
                .add(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE.asItem())
                // TODO: Add Heracroite
                // TODO: Add Houndoominite
                .add(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE.asItem())
                // Gen 3
                // TODO: Add Absolite
                // TODO: Add Aggronite
                // TODO: Add Altarianite
                .add(MegamonsBlocks.ORE_CRYSTAL_BANETTITE.asItem())
                // TODO: Add Blazikenite
                // TODO: Add Cameruptite
                .add(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_GLALITITE.asItem())
                // TODO: Add Latiasite
                // TODO: Add Latiosite
                .add(MegamonsBlocks.ORE_CRYSTAL_MAWILITE.asItem())
                // TODO: Add Manechtite
                // TODO: Add Medichamite
                // TODO: Add Metagrossite
                // TODO: Add Rayquazite
                .add(MegamonsBlocks.ORE_CRYSTAL_SABLENITE.asItem())
                // TODO: Add Salamencite
                // TODO: Add Sceptilite
                .add(MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE.asItem())
                // TODO: Add Swampertite
                // Gen 4
                // TODO: Add Abomasite
                .add(MegamonsBlocks.ORE_CRYSTAL_GALLADITE.asItem())
                .add(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE.asItem())
                // TODO: Add Lopunnite
                // TODO: Add Lucarionite
                // Gen 5
                // TODO: Add Audinite
                // Gen 6
                // TODO: Add Diancite
                // Gen 7+

                ;



        getOrCreateTagBuilder(ModTags.Items.GEN1_CUT_MEGASTONES)
                .add(MegamonsItems.CUT_AERODACTYLITE)
                .add(MegamonsItems.CUT_ALAKAZITE)
                .add(MegamonsItems.CUT_BEEDRILLITE)
                .add(MegamonsItems.CUT_BLASTOISINITE)
                .add(MegamonsItems.CUT_CHARIZARDITEX)
                .add(MegamonsItems.CUT_CHARIZARDITEY)
                .add(MegamonsItems.CUT_GENGARITE)
                .add(MegamonsItems.CUT_GYARADOSITE)
                .add(MegamonsItems.CUT_KANGASKHANITE)
                .add(MegamonsItems.CUT_MEWTWONITEX)
                .add(MegamonsItems.CUT_MEWTWONITEY)
                .add(MegamonsItems.CUT_PIDGEOTITE)
                .add(MegamonsItems.CUT_PINSIRITE)
                .add(MegamonsItems.CUT_SLOWBRONITE)
                .add(MegamonsItems.CUT_VENUSAURITE);

        getOrCreateTagBuilder(ModTags.Items.GEN2_CUT_MEGASTONES)
                .add(MegamonsItems.CUT_AMPHAROSITE)
                // TODO: Add Heracronite
                // TODO: Add Houndoominite
                .add(MegamonsItems.CUT_SCIZORITE)
                .add(MegamonsItems.CUT_STEELIXITE)
                .add(MegamonsItems.CUT_TYRANITARITE)
                ;



        getOrCreateTagBuilder(ModTags.Items.GEN3_CUT_MEGASTONES)
                // TODO: Add Absolite
                // TODO: Add Aggronite
                // TODO: Add Altarianite
                .add(MegamonsItems.CUT_BANETTITE)
                // TODO: Add Blazikenite
                // TODO: Add Cameruptite
                .add(MegamonsItems.CUT_GARDEVOIRITE)
                .add(MegamonsItems.CUT_GLALITITE)
                // TODO: Add Latiasite
                // TODO: Add Latiosite
                .add(MegamonsItems.CUT_MAWILITE)
                // TODO: Add Manechtite
                // TODO: Add Medichamite
                // TODO: Add Metagrossite
                // TODO: Add Rayquazite
                .add(MegamonsItems.CUT_SABLENITE)
                // TODO: Add Salamencite
                // TODO: Add Sceptilite
                .add(MegamonsItems.CUT_SHARPEDONITE)
                // TODO: Add Swampertite
                ;

        getOrCreateTagBuilder(ModTags.Items.GEN4_CUT_MEGASTONES)
                // TODO: Add Abomasite
                .add(MegamonsItems.CUT_GALLADITE)
                .add(MegamonsItems.CUT_GARCHOMPITE)
                // TODO: Add Lopunnite
                // TODO: Add Lucarionite
                ;

        getOrCreateTagBuilder(ModTags.Items.GEN5_CUT_MEGASTONES)
        // TODO: Add Audinite
        ;


        getOrCreateTagBuilder(ModTags.Items.GEN6_CUT_MEGASTONES)
        // Gen 6
        // TODO: Add Diancite
        ;


    }
}
