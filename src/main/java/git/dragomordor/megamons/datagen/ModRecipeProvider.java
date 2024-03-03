package git.dragomordor.megamons.datagen;

import com.cobblemon.mod.common.CobblemonItems;
import git.dragomordor.megamons.MegamonsMod;
import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.item.MegamonsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;




public class ModRecipeProvider extends FabricRecipeProvider {

    // Item lists
    // Megastone smelt tables
    private static final List<ItemConvertible> ORE_SMELT_AERODACTYLITE = List.of(
//            MegamonsBlocks.ORE_AERODACTYLITE,
//            MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE,
            MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE);

    private static final List<ItemConvertible> ORE_SMELT_ALAKAZITE = List.of(
//            MegamonsBlocks.ORE_ALAKAZITE,
//            MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE,
            MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE);

    private static final List<ItemConvertible> ORE_SMELT_BEEDRILLITE = List.of(
//            MegamonsBlocks.ORE_BEEDRILLITE,
//            MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE,
            MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE);

    private static final List<ItemConvertible> ORE_SMELT_BLASTOISINITE = List.of(
//            MegamonsBlocks.ORE_BLASTOISINITE,
//            MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE,
            MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE);

    private static final List<ItemConvertible> ORE_SMELT_CHARIZARDITEX = List.of(
//            MegamonsBlocks.ORE_CHARIZARDITEX,
//            MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX,
            MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX);

    private static final List<ItemConvertible> ORE_SMELT_CHARIZARDITEY = List.of(
//            MegamonsBlocks.ORE_CHARIZARDITEY,
//            MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY,
            MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY);

    private static final List<ItemConvertible> ORE_SMELT_GENGARITE = List.of(
//            MegamonsBlocks.ORE_GENGARITE,
//            MegamonsBlocks.ORE_DEEPSLATE_GENGARITE,
            MegamonsBlocks.ORE_CRYSTAL_GENGARITE);

    private static final List<ItemConvertible> ORE_SMELT_GYARADOSITE = List.of(
//            MegamonsBlocks.ORE_GYARADOSITE,
//            MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE,
            MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE);

    private static final List<ItemConvertible> ORE_SMELT_KANGASKHANITE = List.of(
//            MegamonsBlocks.ORE_KANGASKHANITE,
//            MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE,
            MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE);

    private static final List<ItemConvertible> ORE_SMELT_MEWTWONITEX = List.of(
//            MegamonsBlocks.ORE_MEWTWONITEX,
//            MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX,
            MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX);

    private static final List<ItemConvertible> ORE_SMELT_MEWTWONITEY = List.of(
//            MegamonsBlocks.ORE_MEWTWONITEY,
//            MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY,
            MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY);

    private static final List<ItemConvertible> ORE_SMELT_PIDGEOTITE = List.of(
//            MegamonsBlocks.ORE_PIDGEOTITE,
//            MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE,
            MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE);

    private static final List<ItemConvertible> ORE_SMELT_PINSIRITE = List.of(
//            MegamonsBlocks.ORE_PINSIRITE,
//            MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE,
            MegamonsBlocks.ORE_CRYSTAL_PINSIRITE);

    private static final List<ItemConvertible> ORE_SMELT_SLOWBRONITE = List.of(
//            MegamonsBlocks.ORE_SLOWBRONITE,
//            MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE,
            MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE);

    private static final List<ItemConvertible> ORE_SMELT_VENUSAURITE = List.of(
//            MegamonsBlocks.ORE_VENUSAURITE,
//            MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE,
            MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE);

    // Evo ores
    private static final List<ItemConvertible> ORE_SMELT_DAWN_EVO = List.of(
            MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_DUSK_EVO = List.of(
            MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_FIRE_EVO = List.of(
            MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_ICE_EVO = List.of(
            MegamonsBlocks.CRYSTAL_ICE_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_LEAF_EVO = List.of(
            MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_MOON_EVO = List.of(
            MegamonsBlocks.CRYSTAL_MOON_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_SHINY_EVO = List.of(
            MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_SUN_EVO = List.of(
            MegamonsBlocks.CRYSTAL_SUN_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_THUNDER_EVO = List.of(
            MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE);

    private static final List<ItemConvertible> ORE_SMELT_WATER_EVO = List.of(
            MegamonsBlocks.CRYSTAL_WATER_STONE_ORE);


    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // Raw Megastone to Cut Megastone via stonecutter
            // Gen 1
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_AERODACTYLITE, MegamonsItems.RAW_AERODACTYLITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_ALAKAZITE, MegamonsItems.RAW_ALAKAZITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_BEEDRILLITE, MegamonsItems.RAW_BEEDRILLITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_BLASTOISINITE, MegamonsItems.RAW_BLASTOISINITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_CHARIZARDITEX, MegamonsItems.RAW_CHARIZARDITEX, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_CHARIZARDITEY, MegamonsItems.RAW_CHARIZARDITEY, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_GENGARITE, MegamonsItems.RAW_GENGARITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_GYARADOSITE, MegamonsItems.RAW_GYARADOSITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_KANGASKHANITE, MegamonsItems.RAW_KANGASKHANITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_MEWTWONITEX, MegamonsItems.RAW_MEWTWONITEX, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_MEWTWONITEY, MegamonsItems.RAW_MEWTWONITEY, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_PIDGEOTITE, MegamonsItems.RAW_PIDGEOTITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_PINSIRITE, MegamonsItems.RAW_PINSIRITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_SLOWBRONITE, MegamonsItems.RAW_SLOWBRONITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_VENUSAURITE, MegamonsItems.RAW_VENUSAURITE, 1);
            // Gen 2
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_AMPHAROSITE, MegamonsItems.RAW_AMPHAROSITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_BANETTITE, MegamonsItems.RAW_BANETTITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_GARCHOMPITE, MegamonsItems.RAW_GARCHOMPITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_GARDEVOIRITE, MegamonsItems.RAW_GARDEVOIRITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_GLALITITE, MegamonsItems.RAW_GLALITITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_MAWILITE, MegamonsItems.RAW_MAWILITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_SABLENITE, MegamonsItems.RAW_SABLENITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_SCIZORITE, MegamonsItems.RAW_SCIZORITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_SHARPEDONITE, MegamonsItems.RAW_SHARPEDONITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_STEELIXITE, MegamonsItems.RAW_STEELIXITE, 1);
        offerStonecuttingRecipe(exporter, RecipeCategory.MISC, MegamonsItems.CUT_TYRANITARITE, MegamonsItems.RAW_TYRANITARITE, 1);
            // Gen 3


    // Smelt Ore Megastone to Raw Megastone
        // Smelting
        offerSmelting(exporter, ORE_SMELT_AERODACTYLITE, RecipeCategory.MISC, MegamonsItems.RAW_AERODACTYLITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_ALAKAZITE, RecipeCategory.MISC, MegamonsItems.RAW_ALAKAZITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_BEEDRILLITE, RecipeCategory.MISC, MegamonsItems.RAW_BEEDRILLITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_BLASTOISINITE, RecipeCategory.MISC, MegamonsItems.RAW_BLASTOISINITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_CHARIZARDITEX, RecipeCategory.MISC, MegamonsItems.RAW_CHARIZARDITEX, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_CHARIZARDITEY, RecipeCategory.MISC, MegamonsItems.RAW_CHARIZARDITEY, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_GENGARITE, RecipeCategory.MISC, MegamonsItems.RAW_GENGARITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_GYARADOSITE, RecipeCategory.MISC, MegamonsItems.RAW_GYARADOSITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_KANGASKHANITE, RecipeCategory.MISC, MegamonsItems.RAW_KANGASKHANITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_MEWTWONITEX, RecipeCategory.MISC, MegamonsItems.RAW_MEWTWONITEX, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_MEWTWONITEY, RecipeCategory.MISC, MegamonsItems.RAW_MEWTWONITEY, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_PIDGEOTITE, RecipeCategory.MISC, MegamonsItems.RAW_PIDGEOTITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_PINSIRITE, RecipeCategory.MISC, MegamonsItems.RAW_PINSIRITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_SLOWBRONITE, RecipeCategory.MISC, MegamonsItems.RAW_SLOWBRONITE, 1.0F, 200, "megastones");
        offerSmelting(exporter, ORE_SMELT_VENUSAURITE, RecipeCategory.MISC, MegamonsItems.RAW_VENUSAURITE, 1.0F, 200, "megastones");
        // Blasting
        offerBlasting(exporter, ORE_SMELT_AERODACTYLITE, RecipeCategory.MISC, MegamonsItems.RAW_AERODACTYLITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_ALAKAZITE, RecipeCategory.MISC, MegamonsItems.RAW_ALAKAZITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_BEEDRILLITE, RecipeCategory.MISC, MegamonsItems.RAW_BEEDRILLITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_BLASTOISINITE, RecipeCategory.MISC, MegamonsItems.RAW_BLASTOISINITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_CHARIZARDITEX, RecipeCategory.MISC, MegamonsItems.RAW_CHARIZARDITEX, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_CHARIZARDITEY, RecipeCategory.MISC, MegamonsItems.RAW_CHARIZARDITEY, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_GENGARITE, RecipeCategory.MISC, MegamonsItems.RAW_GENGARITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_GYARADOSITE, RecipeCategory.MISC, MegamonsItems.RAW_GYARADOSITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_KANGASKHANITE, RecipeCategory.MISC, MegamonsItems.RAW_KANGASKHANITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_MEWTWONITEX, RecipeCategory.MISC, MegamonsItems.RAW_MEWTWONITEX, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_MEWTWONITEY, RecipeCategory.MISC, MegamonsItems.RAW_MEWTWONITEY, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_PIDGEOTITE, RecipeCategory.MISC, MegamonsItems.RAW_PIDGEOTITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_PINSIRITE, RecipeCategory.MISC, MegamonsItems.RAW_PINSIRITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_SLOWBRONITE, RecipeCategory.MISC, MegamonsItems.RAW_SLOWBRONITE, 1.0F, 100, "megastones");
        offerBlasting(exporter, ORE_SMELT_VENUSAURITE, RecipeCategory.MISC, MegamonsItems.RAW_VENUSAURITE, 1.0F, 100, "megastones");

        // Evo stones
        offerSmelting(exporter, ORE_SMELT_DAWN_EVO, RecipeCategory.MISC, CobblemonItems.DAWN_STONE, 1.0F, 200, "evo_stones_dawn");
        offerSmelting(exporter, ORE_SMELT_DUSK_EVO, RecipeCategory.MISC, CobblemonItems.DUSK_STONE, 1.0F, 200, "evo_stones_dusk");
        offerSmelting(exporter, ORE_SMELT_FIRE_EVO, RecipeCategory.MISC, CobblemonItems.FIRE_STONE, 1.0F, 200, "evo_stones_fire");
        offerSmelting(exporter, ORE_SMELT_ICE_EVO, RecipeCategory.MISC, CobblemonItems.ICE_STONE, 1.0F, 200, "evo_stones_ice");
        offerSmelting(exporter, ORE_SMELT_LEAF_EVO, RecipeCategory.MISC, CobblemonItems.LEAF_STONE, 1.0F, 200, "evo_stones_leaf");
        offerSmelting(exporter, ORE_SMELT_MOON_EVO, RecipeCategory.MISC, CobblemonItems.MOON_STONE, 1.0F, 200, "evo_stones_moon");
        offerSmelting(exporter, ORE_SMELT_SHINY_EVO, RecipeCategory.MISC, CobblemonItems.SHINY_STONE, 1.0F, 200, "evo_stones_shiny");
        offerSmelting(exporter, ORE_SMELT_SUN_EVO, RecipeCategory.MISC, CobblemonItems.SUN_STONE, 1.0F, 200, "evo_stones_sun");
        offerSmelting(exporter, ORE_SMELT_THUNDER_EVO, RecipeCategory.MISC, CobblemonItems.THUNDER_STONE, 1.0F, 200, "evo_stones_thunder");
        offerSmelting(exporter, ORE_SMELT_WATER_EVO, RecipeCategory.MISC, CobblemonItems.WATER_STONE, 1.0F, 200, "evo_stones_water");

        offerBlasting(exporter, ORE_SMELT_DAWN_EVO, RecipeCategory.MISC, CobblemonItems.DAWN_STONE, 1.0F, 100, "evo_stones_dawn");
        offerBlasting(exporter, ORE_SMELT_DUSK_EVO, RecipeCategory.MISC, CobblemonItems.DUSK_STONE, 1.0F, 100, "evo_stones_dusk");
        offerBlasting(exporter, ORE_SMELT_FIRE_EVO, RecipeCategory.MISC, CobblemonItems.FIRE_STONE, 1.0F, 100, "evo_stones_fire");
        offerBlasting(exporter, ORE_SMELT_ICE_EVO, RecipeCategory.MISC, CobblemonItems.ICE_STONE, 1.0F, 100, "evo_stones_ice");
        offerBlasting(exporter, ORE_SMELT_LEAF_EVO, RecipeCategory.MISC, CobblemonItems.LEAF_STONE, 1.0F, 100, "evo_stones_leaf");
        offerBlasting(exporter, ORE_SMELT_MOON_EVO, RecipeCategory.MISC, CobblemonItems.MOON_STONE, 1.0F, 100, "evo_stones_moon");
        offerBlasting(exporter, ORE_SMELT_SHINY_EVO, RecipeCategory.MISC, CobblemonItems.SHINY_STONE, 1.0F, 100, "evo_stones_shiny");
        offerBlasting(exporter, ORE_SMELT_SUN_EVO, RecipeCategory.MISC, CobblemonItems.SUN_STONE, 1.0F, 100, "evo_stones_sun");
        offerBlasting(exporter, ORE_SMELT_THUNDER_EVO, RecipeCategory.MISC, CobblemonItems.THUNDER_STONE, 1.0F, 100, "evo_stones_thunder");
        offerBlasting(exporter, ORE_SMELT_WATER_EVO, RecipeCategory.MISC, CobblemonItems.WATER_STONE, 1.0F, 100, "evo_stones_water");


    //Mega Cuff recipe
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, MegamonsItems.MEGA_CUFF,1)
                .pattern("iKi")
                .pattern("i i")
                .pattern("i i")
                .input('i', Items.IRON_INGOT)
                .input('K', MegamonsItems.KEY_STONE)
                .criterion(hasItem(Items.IRON_INGOT),conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(MegamonsItems.KEY_STONE),conditionsFromItem(MegamonsItems.KEY_STONE))
                .offerTo(exporter, new Identifier(MegamonsMod.MODID,getRecipeName(MegamonsItems.MEGA_CUFF)));

    //Key Stone recipe
    ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, MegamonsItems.KEY_STONE,1)
                .pattern("GDG")
                .pattern("DAD")
                .pattern("GDG")
                .input('G', Items.GLASS)
                .input('D', Items.DIAMOND)
                .input('A', MegamonsBlocks.ANISTARITE_GEODE_BLOCK)
                .criterion(hasItem(Items.GLASS),conditionsFromItem(Items.GLASS))
                .criterion(hasItem(Items.DIAMOND),conditionsFromItem(Items.DIAMOND))
                .criterion(hasItem(MegamonsBlocks.ANISTARITE_GEODE_BLOCK),conditionsFromItem(MegamonsBlocks.ANISTARITE_GEODE_BLOCK))
                .offerTo(exporter, new Identifier(MegamonsMod.MODID,getRecipeName(MegamonsItems.KEY_STONE)));
    }

}