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
                .add(MegamonsItems.CUT_BANETTITE)
                .add(MegamonsItems.CUT_GARCHOMPITE)
                .add(MegamonsItems.CUT_GARDEVOIRITE)
                .add(MegamonsItems.CUT_GLALITITE)
                .add(MegamonsItems.CUT_MAWILITE)
                .add(MegamonsItems.CUT_SABLENITE)
                .add(MegamonsItems.CUT_SCIZORITE)
                .add(MegamonsItems.CUT_SHARPEDONITE)
                .add(MegamonsItems.CUT_STEELIXITE)
                .add(MegamonsItems.CUT_TYRANITARITE);
                // Gen 3
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
                .add(MegamonsItems.RAW_BANETTITE)
                .add(MegamonsItems.RAW_GARCHOMPITE)
                .add(MegamonsItems.RAW_GARDEVOIRITE)
                .add(MegamonsItems.RAW_GLALITITE)
                .add(MegamonsItems.RAW_MAWILITE)
                .add(MegamonsItems.RAW_SABLENITE)
                .add(MegamonsItems.RAW_SCIZORITE)
                .add(MegamonsItems.RAW_SHARPEDONITE)
                .add(MegamonsItems.RAW_STEELIXITE)
                .add(MegamonsItems.RAW_TYRANITARITE);
                // Gen 3

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
                .add(MegamonsItems.CUT_BANETTITE)
                .add(MegamonsItems.CUT_GARCHOMPITE)
                .add(MegamonsItems.CUT_GARDEVOIRITE)
                .add(MegamonsItems.CUT_GLALITITE)
                .add(MegamonsItems.CUT_MAWILITE)
                .add(MegamonsItems.CUT_SABLENITE)
                .add(MegamonsItems.CUT_SCIZORITE)
                .add(MegamonsItems.CUT_SHARPEDONITE)
                .add(MegamonsItems.CUT_STEELIXITE)
                .add(MegamonsItems.CUT_TYRANITARITE);


    }
}
