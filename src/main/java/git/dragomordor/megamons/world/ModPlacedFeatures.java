package git.dragomordor.megamons.world;

import git.dragomordor.megamons.MegamonsMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {
    // Geodes
        // Gen 1
    public static final RegistryKey<PlacedFeature> AERODACTYLITE_GEODE_PLACED_KEY = registerKey("aerodactylite_geode_placed");
    public static final RegistryKey<PlacedFeature> ALAKAZITE_GEODE_PLACED_KEY = registerKey("alakazite_geode_placed");
    public static final RegistryKey<PlacedFeature> BEEDRILLITE_GEODE_PLACED_KEY = registerKey("beedrillite_geode_placed");
    public static final RegistryKey<PlacedFeature> BLASTOISINITE_GEODE_PLACED_KEY = registerKey("blastoisinite_geode_placed");
    public static final RegistryKey<PlacedFeature> CHARIZARDITEX_GEODE_PLACED_KEY = registerKey("charizarditex_geode_placed");
    public static final RegistryKey<PlacedFeature> CHARIZARDITEY_GEODE_PLACED_KEY = registerKey("charizarditey_geode_placed");
    public static final RegistryKey<PlacedFeature> GENGARITE_GEODE_PLACED_KEY = registerKey("gengarite_geode_placed");
    public static final RegistryKey<PlacedFeature> GYARADOSITE_GEODE_PLACED_KEY = registerKey("gyaradosite_geode_placed");
    public static final RegistryKey<PlacedFeature> KANGASKHANITE_GEODE_PLACED_KEY = registerKey("kangaskhanite_geode_placed");
    public static final RegistryKey<PlacedFeature> MEWTWONITEX_GEODE_PLACED_KEY = registerKey("mewtwonitex_geode_placed");
    public static final RegistryKey<PlacedFeature> MEWTWONITEY_GEODE_PLACED_KEY = registerKey("mewtwonitey_geode_placed");
    public static final RegistryKey<PlacedFeature> PIDGEOTITE_GEODE_PLACED_KEY = registerKey("pidgeotite_geode_placed");
    public static final RegistryKey<PlacedFeature> PINSIRITE_GEODE_PLACED_KEY = registerKey("pinsirite_geode_placed");
    public static final RegistryKey<PlacedFeature> SLOWBRONITE_GEODE_PLACED_KEY = registerKey("slowbronite_geode_placed");
    public static final RegistryKey<PlacedFeature> VENUSAURITE_GEODE_PLACED_KEY = registerKey("venusaurite_geode_placed");
        // Gen 2





    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        //Geodes
        register(context, AERODACTYLITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AERODACTYLITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, ALAKAZITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALAKAZITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, BEEDRILLITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BEEDRILLITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, BLASTOISINITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLASTOISINITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, CHARIZARDITEX_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHARIZARDITEX_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, CHARIZARDITEY_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHARIZARDITEY_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, GENGARITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GENGARITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, GYARADOSITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GYARADOSITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, KANGASKHANITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KANGASKHANITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, MEWTWONITEX_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MEWTWONITEX_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, MEWTWONITEY_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MEWTWONITEY_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, PIDGEOTITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PIDGEOTITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, PINSIRITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINSIRITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, SLOWBRONITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLOWBRONITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
       register(context, VENUSAURITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VENUSAURITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(600), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());

    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(MegamonsMod.MODID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }

}
