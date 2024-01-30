package git.dragomordor.megastones.world;

import com.cobblemon.mod.common.CobblemonBlocks;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import git.dragomordor.megastones.MegastonesMod;
import git.dragomordor.megastones.block.MegastonesBlocks;
import git.dragomordor.megastones.util.ModTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.stateprovider.WeightedBlockStateProvider;

import java.util.List;

public class ModConfiguredFeatures {

    // Geodes
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

// Register ore json files
    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endsReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);
        RuleTest megastoneWallReplaceables = new TagMatchRuleTest(ModTags.Blocks.GEODE_WALLS);

        List<OreFeatureConfig.Target> overworldAerodactaliteOres = List.of(
                        OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_AERODACTYLITE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_AERODACTYLITE.getDefaultState()),
                        OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_AERODACTYLITE.getDefaultState())
                );

        List<OreFeatureConfig.Target> overworldAlakaziteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_ALAKAZITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_ALAKAZITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE.getDefaultState())
        );

        List<OreFeatureConfig.Target> overworldBeedrilliteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_BEEDRILLITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_BEEDRILLITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldBlastoisiniteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_BLASTOISINITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_BLASTOISINITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldCharizarditeXOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_CHARIZARDITEX.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEX.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldCharizarditeYOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_CHARIZARDITEY.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_CHARIZARDITEY.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldGengariteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_GENGARITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_GENGARITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_GENGARITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldGyaradositeOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_GYARADOSITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_GYARADOSITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldKangaskhaniteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_KANGASKHANITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_KANGASKHANITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldMewtwoniteXOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_MEWTWONITEX.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEX.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldMewtwoniteYOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_MEWTWONITEY.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_MEWTWONITEY.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldPidgeotiteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_PIDGEOTITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_PIDGEOTITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldPinsiriteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_PINSIRITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_PINSIRITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_PINSIRITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldSlowbroniteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_SLOWBRONITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_SLOWBRONITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE.getDefaultState())

        );

        List<OreFeatureConfig.Target> overworldVenusauriteOres = List.of(
                OreFeatureConfig.createTarget(stoneReplaceables, MegastonesBlocks.ORE_VENUSAURITE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateReplaceables, MegastonesBlocks.ORE_DEEPSLATE_VENUSAURITE.getDefaultState()),
                OreFeatureConfig.createTarget(megastoneWallReplaceables, MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE.getDefaultState())

        );

        // Geodes
        // Aerodactylite geode
        register(context, AERODACTYLITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_AERODACTYLITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Alakazite geode
        register(context, ALAKAZITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_ALAKAZITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));

        // Beedrilite geode
        register(context, BEEDRILLITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_BEEDRILLITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Blastoisinite geode
        register(context, BLASTOISINITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_BLASTOISINITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // CharizarditeX geode
        register(context, CHARIZARDITEX_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEX), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // CharizarditeY geode
        register(context, CHARIZARDITEY_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_CHARIZARDITEY), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Gengarite geode
        register(context, GENGARITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_GENGARITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Gyaradosite geode
        register(context, GYARADOSITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_GYARADOSITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // kangaskhanite geode
        register(context, KANGASKHANITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_KANGASKHANITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // MewtwoniteX geode
        register(context, MEWTWONITEX_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEX), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // MewtwoniteY geode
        register(context, MEWTWONITEY_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_MEWTWONITEY), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Pidgeotite geode
        register(context, PIDGEOTITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_PIDGEOTITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Pinsirite geode
        register(context, PINSIRITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_PINSIRITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Slowbronite geode
        register(context, SLOWBRONITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_SLOWBRONITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
        // Venusaurite geode
        register(context, VENUSAURITE_GEODE_KEY, Feature.GEODE, new GeodeFeatureConfig(
                new GeodeLayerConfig(
                        BlockStateProvider.of(Blocks.AIR), // filling
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_CRYSTAL_WALL), // inner layer
                        BlockStateProvider.of(MegastonesBlocks.ORE_CRYSTAL_VENUSAURITE), //alternate inner layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // middle layer
                        BlockStateProvider.of(MegastonesBlocks.GEODE_MEGASTONE_SHELL_WALL), // outer layer
                        List.of( // inner blocks
                                CobblemonBlocks.DAWN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.DUSK_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.FIRE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.ICE_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.LEAF_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.MOON_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SHINY_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.SUN_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.THUNDER_STONE_ORE.getDefaultState(),
                                CobblemonBlocks.WATER_STONE_ORE.getDefaultState()
                        ),
                        BlockTags.FEATURES_CANNOT_REPLACE , BlockTags.GEODE_INVALID_BLOCKS),
                new GeodeLayerThicknessConfig(1.2D, 2.5D, 3.0D, 3.5D),
                new GeodeCrackConfig(0.1D, 0.4D, 1),
                0.025D, 0.002D,
                false, UniformIntProvider.create(4, 5),
                UniformIntProvider.create(3, 4), UniformIntProvider.create(1, 2),
                -16, 16, 0.05D, 1));
    }

    // Helper methods
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(MegastonesMod.MODID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
