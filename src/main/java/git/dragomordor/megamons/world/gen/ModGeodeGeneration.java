package git.dragomordor.megamons.world.gen;

import com.cobblemon.mod.common.api.tags.CobblemonBiomeTags;
import git.dragomordor.megamons.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

import java.util.ArrayList;
import java.util.List;

public class ModGeodeGeneration {

    private static final List<BlockPos> geodeLocations = new ArrayList<>();

    public static void generateGeodes() {

        // Gen 1
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.AERODACTYLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.ALAKAZITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BEEDRILLITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.BLASTOISINITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.CHARIZARDITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GENGARITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.GYARADOSITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.KANGASKHANITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEX_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.MEWTWONITEY_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PIDGEOTITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.PINSIRITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.SLOWBRONITE_GEODE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.UNDERGROUND_DECORATION, ModPlacedFeatures.VENUSAURITE_GEODE_PLACED_KEY);
        // Gen 2





    }

}
