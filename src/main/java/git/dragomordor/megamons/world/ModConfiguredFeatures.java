package git.dragomordor.megamons.world;

import git.dragomordor.megamons.MegamonsMod;
import git.dragomordor.megamons.block.MegamonsBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {

    // Geodes
        // Gen 1
    public static final RegistryKey<ConfiguredFeature<?,?>> AERODACTYLITE_GEODE_KEY = registerKey("aerodactylite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> ALAKAZITE_GEODE_KEY = registerKey("alakazite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> BEEDRILLITE_GEODE_KEY = registerKey("beedrillite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> BLASTOISINITE_GEODE_KEY = registerKey("blastoisinite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> CHARIZARDITEX_GEODE_KEY = registerKey("charizarditex_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> CHARIZARDITEY_GEODE_KEY = registerKey("charizarditey_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> GENGARITE_GEODE_KEY = registerKey("gengarite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> GYARADOSITE_GEODE_KEY = registerKey("gyaradosite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> KANGASKHANITE_GEODE_KEY = registerKey("kangaskhanite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> MEWTWONITEX_GEODE_KEY = registerKey("mewtwonitex_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> MEWTWONITEY_GEODE_KEY = registerKey("mewtwonitey_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> PIDGEOTITE_GEODE_KEY = registerKey("pidgeotite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> PINSIRITE_GEODE_KEY = registerKey("pinsirite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> SLOWBRONITE_GEODE_KEY = registerKey("slowbronite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> VENUSAURITE_GEODE_KEY = registerKey("venusaurite_geode") ;
        // Gen 2
    public static final RegistryKey<ConfiguredFeature<?,?>> AMPHAROSITE_GEODE_KEY = registerKey("ampharosite_geode") ;
    // TODO: Add Heracronite
    // TODO: Add Houndoominite
    public static final RegistryKey<ConfiguredFeature<?,?>> SCIZORITE_GEODE_KEY = registerKey("scizorite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> STEELIXITE_GEODE_KEY = registerKey("steelixite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> TYRANITARITE_GEODE_KEY = registerKey("tyranitarite_geode") ;
        // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
    public static final RegistryKey<ConfiguredFeature<?,?>> BANETTITE_GEODE_KEY = registerKey("banettite_geode") ;
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final RegistryKey<ConfiguredFeature<?,?>> GARDEVOIRITE_GEODE_KEY = registerKey("gardevoirite_geode") ;
    public static final RegistryKey<ConfiguredFeature<?,?>> GLALITITE_GEODE_KEY = registerKey("glalitite_geode") ;
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final RegistryKey<ConfiguredFeature<?,?>> MAWILITE_GEODE_KEY = registerKey("mawilite_geode") ;
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final RegistryKey<ConfiguredFeature<?,?>> SABLENITE_GEODE_KEY = registerKey("sablenite_geode") ;
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final RegistryKey<ConfiguredFeature<?,?>> SHARPEDONITE_GEODE_KEY = registerKey("sharpedonite_geode") ;
    // TODO: Add Swampertite
    // Gen 4
    // TODO: Add Abomasite
    // TODO: Add Galladite
    public static final RegistryKey<ConfiguredFeature<?,?>> GARCHOMPITE_GEODE_KEY = registerKey("garchompite_geode") ;
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
    // Gen 5
    // TODO: Add Audinite
    // Gen 6
    // TODO: Add Diancite
    // Gen 7+


// Register ore json files
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
    // Geodes
    // Gen 1
        // Aerodactylite geode
        register(context, AERODACTYLITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Alakazite geode
        register(context, ALAKAZITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // Beedrilite geode
        register(context, BEEDRILLITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Blastoisinite geode
        register(context, BLASTOISINITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // CharizarditeX geode
        register(context, CHARIZARDITEX_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // CharizarditeY geode
        register(context, CHARIZARDITEY_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Gengarite geode
        register(context, GENGARITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_GENGARITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Gyaradosite geode
        register(context, GYARADOSITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // kangaskhanite geode
        register(context, KANGASKHANITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // MewtwoniteX geode
        register(context, MEWTWONITEX_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // MewtwoniteY geode
        register(context, MEWTWONITEY_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Pidgeotite geode
        register(context, PIDGEOTITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Pinsirite geode
        register(context, PINSIRITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Slowbronite geode
        register(context, SLOWBRONITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Venusaurite geode
        register(context, VENUSAURITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

    // Gen 2
        // Amphorisite
        register(context, AMPHAROSITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

    // TODO: Add Heracronite
    // TODO: Add Houndoominite

        // Scizorite
        register(context, SCIZORITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // Steelixite
        register(context, STEELIXITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // Tyranitarite
        register(context, TYRANITARITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite

        // Banettite
        register(context, BANETTITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_BANETTITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // TODO: Add Blazikenite
        // TODO: Add Cameruptite

        // Gardevoirite
        register(context, GARDEVOIRITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // Glalitite
        register(context, GLALITITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_GLALITITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // TODO: Add Latiasite
        // TODO: Add Latiosite

        // Mawilite
        register(context, MAWILITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_MAWILITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite

        // Sablenite
        register(context, SABLENITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_SABLENITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // TODO: Add Salamencite
        // TODO: Add Sceptilite

        // Sharpedonite
        register(context, SHARPEDONITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite
        // TODO: Add Galladite

        // Garchompite
        register(context, GARCHOMPITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_GEODE_BLOCK), // inner layer
                        BlockStateProvider.of(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE), //alternate inner layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // middle layer
                        BlockStateProvider.of(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK), // outer layer
                        List.of( // inner blocks
                                MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_ICE_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_MOON_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_SUN_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE.getDefaultState(),
                                MegamonsBlocks.CRYSTAL_WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.0D, 2.8D, 2.9D, 3.9D),
                new GeodeCrackConfig(0.3D, 1.0D, 1),
                0.025D, 0.0025D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+

    }


    // Helper methods
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MegamonsMod.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
