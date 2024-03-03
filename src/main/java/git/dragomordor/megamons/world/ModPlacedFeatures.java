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

    private static final int GeodeCount = 26;
    private static final int GeodeRarity = 40;


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
    public static final RegistryKey<PlacedFeature> AMPHAROSITE_GEODE_PLACED_KEY = registerKey("ampharosite_geode_placed");
    // TODO: Add Heracronite
    // TODO: Add Houndoominite
    public static final RegistryKey<PlacedFeature> SCIZORITE_GEODE_PLACED_KEY = registerKey("scizorite_geode_placed");
    public static final RegistryKey<PlacedFeature> STEELIXITE_GEODE_PLACED_KEY = registerKey("steelixite_geode_placed");
    public static final RegistryKey<PlacedFeature> TYRANITARITE_GEODE_PLACED_KEY = registerKey("tyranitarite_geode_placed");
    // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
    public static final RegistryKey<PlacedFeature> BANETTITE_GEODE_PLACED_KEY = registerKey("banettite_geode_placed");
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final RegistryKey<PlacedFeature> GARDEVOIRITE_GEODE_PLACED_KEY = registerKey("gardevoirite_geode_placed");
    public static final RegistryKey<PlacedFeature> GLALITITE_GEODE_PLACED_KEY = registerKey("glalitite_geode_placed");
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final RegistryKey<PlacedFeature> MAWILITE_GEODE_PLACED_KEY = registerKey("mawilite_geode_placed");
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final RegistryKey<PlacedFeature> SABLENITE_GEODE_PLACED_KEY = registerKey("sablenite_geode_placed");
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final RegistryKey<PlacedFeature> SHARPEDONITE_GEODE_PLACED_KEY = registerKey("sharpedonite_geode_placed");
    // TODO: Add Swampertite
    // Gen 4
    // TODO: Add Abomasite
    // TODO: Add Galladite
    public static final RegistryKey<PlacedFeature> GARCHOMPITE_GEODE_PLACED_KEY = registerKey("garchompite_geode_placed");
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
    // Gen 5
    // TODO: Add Audinite
    // Gen 6
    // TODO: Add Diancite
    // Gen 7+


    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        int rarityMultiplier = GeodeCount * GeodeRarity;

    //Geodes
        // Gen 1
        register(context, AERODACTYLITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AERODACTYLITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, ALAKAZITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ALAKAZITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, BEEDRILLITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BEEDRILLITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, BLASTOISINITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BLASTOISINITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, CHARIZARDITEX_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHARIZARDITEX_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, CHARIZARDITEY_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.CHARIZARDITEY_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, GENGARITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GENGARITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, GYARADOSITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GYARADOSITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, KANGASKHANITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.KANGASKHANITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, MEWTWONITEX_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MEWTWONITEX_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, MEWTWONITEY_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MEWTWONITEY_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, PIDGEOTITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PIDGEOTITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, PINSIRITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.PINSIRITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, SLOWBRONITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SLOWBRONITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, VENUSAURITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.VENUSAURITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
       // Gen 2
        register(context, AMPHAROSITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.AMPHAROSITE_GEODE_KEY),
               RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                       YOffset.fixed(30)), BiomePlacementModifier.of());
        // TODO: Add Heracronite
        // TODO: Add Houndoominite
        register(context, SCIZORITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SCIZORITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, STEELIXITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.STEELIXITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, TYRANITARITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.TYRANITARITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite
        register(context, BANETTITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.BANETTITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        // TODO: Add Blazikenite
        // TODO: Add Cameruptite
        register(context, GARDEVOIRITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GARDEVOIRITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        register(context, GLALITITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GLALITITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        // TODO: Add Latiasite
        // TODO: Add Latiosite
        register(context, MAWILITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.MAWILITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite
        register(context, SABLENITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SABLENITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        // TODO: Add Salamencite
        // TODO: Add Sceptilite
        register(context, SHARPEDONITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SHARPEDONITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite
        // TODO: Add Galladite
        register(context, GARCHOMPITE_GEODE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GARCHOMPITE_GEODE_KEY),
                RarityFilterPlacementModifier.of(rarityMultiplier), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.aboveBottom(6),
                        YOffset.fixed(30)), BiomePlacementModifier.of());
        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+

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
