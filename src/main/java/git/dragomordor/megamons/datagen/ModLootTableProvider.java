package git.dragomordor.megamons.datagen;


import com.cobblemon.mod.common.CobblemonItems;
import git.dragomordor.megamons.block.MegamonsBlocks;
import git.dragomordor.megamons.item.MegamonsItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        // Megastone Ores drop raw stones
        // stone ores
//        addDrop(MegamonsBlocks.ORE_AERODACTYLITE, megastoneOreDrops(MegamonsBlocks.ORE_AERODACTYLITE, MegamonsItems.RAW_AERODACTYLITE));
//        addDrop(MegamonsBlocks.ORE_ALAKAZITE, megastoneOreDrops(MegamonsBlocks.ORE_ALAKAZITE, MegamonsItems.RAW_ALAKAZITE));
//        addDrop(MegamonsBlocks.ORE_BEEDRILLITE, megastoneOreDrops(MegamonsBlocks.ORE_BEEDRILLITE, MegamonsItems.RAW_BEEDRILLITE));
//        addDrop(MegamonsBlocks.ORE_BLASTOISINITE, megastoneOreDrops(MegamonsBlocks.ORE_BLASTOISINITE, MegamonsItems.RAW_BLASTOISINITE));
//        addDrop(MegamonsBlocks.ORE_CHARIZARDITEX, megastoneOreDrops(MegamonsBlocks.ORE_CHARIZARDITEX, MegamonsItems.RAW_CHARIZARDITEX));
//        addDrop(MegamonsBlocks.ORE_CHARIZARDITEY, megastoneOreDrops(MegamonsBlocks.ORE_CHARIZARDITEY, MegamonsItems.RAW_CHARIZARDITEY));
//        addDrop(MegamonsBlocks.ORE_GENGARITE, megastoneOreDrops(MegamonsBlocks.ORE_GENGARITE, MegamonsItems.RAW_GENGARITE));
//        addDrop(MegamonsBlocks.ORE_GYARADOSITE, megastoneOreDrops(MegamonsBlocks.ORE_GYARADOSITE, MegamonsItems.RAW_GYARADOSITE));
//        addDrop(MegamonsBlocks.ORE_KANGASKHANITE, megastoneOreDrops(MegamonsBlocks.ORE_KANGASKHANITE, MegamonsItems.RAW_KANGASKHANITE));
//        addDrop(MegamonsBlocks.ORE_MEWTWONITEX, megastoneOreDrops(MegamonsBlocks.ORE_MEWTWONITEX, MegamonsItems.RAW_MEWTWONITEX));
//        addDrop(MegamonsBlocks.ORE_MEWTWONITEY, megastoneOreDrops(MegamonsBlocks.ORE_MEWTWONITEY, MegamonsItems.RAW_MEWTWONITEY));
//        addDrop(MegamonsBlocks.ORE_PIDGEOTITE, megastoneOreDrops(MegamonsBlocks.ORE_PIDGEOTITE, MegamonsItems.RAW_PIDGEOTITE));
//        addDrop(MegamonsBlocks.ORE_PINSIRITE, megastoneOreDrops(MegamonsBlocks.ORE_PINSIRITE, MegamonsItems.RAW_PINSIRITE));
//        addDrop(MegamonsBlocks.ORE_SLOWBRONITE, megastoneOreDrops(MegamonsBlocks.ORE_SLOWBRONITE, MegamonsItems.RAW_SLOWBRONITE));
//        addDrop(MegamonsBlocks.ORE_VENUSAURITE, megastoneOreDrops(MegamonsBlocks.ORE_VENUSAURITE, MegamonsItems.RAW_VENUSAURITE));
//        // deepslate ores
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_AERODACTYLITE, MegamonsItems.RAW_AERODACTYLITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_ALAKAZITE, MegamonsItems.RAW_ALAKAZITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_BEEDRILLITE, MegamonsItems.RAW_BEEDRILLITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_BLASTOISINITE, MegamonsItems.RAW_BLASTOISINITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEX, MegamonsItems.RAW_CHARIZARDITEX));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_CHARIZARDITEY, MegamonsItems.RAW_CHARIZARDITEY));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_GENGARITE, MegamonsItems.RAW_GENGARITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_GYARADOSITE, MegamonsItems.RAW_GYARADOSITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_KANGASKHANITE, MegamonsItems.RAW_KANGASKHANITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEX, MegamonsItems.RAW_MEWTWONITEX));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_MEWTWONITEY, MegamonsItems.RAW_MEWTWONITEY));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_PIDGEOTITE, MegamonsItems.RAW_PIDGEOTITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_PINSIRITE, MegamonsItems.RAW_PINSIRITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_SLOWBRONITE, MegamonsItems.RAW_SLOWBRONITE));
//        addDrop(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE, megastoneOreDrops(MegamonsBlocks.ORE_DEEPSLATE_VENUSAURITE, MegamonsItems.RAW_VENUSAURITE));

        // Crystal ores
        // Gen 1
        addDrop(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_AERODACTYLITE, MegamonsItems.RAW_AERODACTYLITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_ALAKAZITE, MegamonsItems.RAW_ALAKAZITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_BEEDRILLITE, MegamonsItems.RAW_BEEDRILLITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_BLASTOISINITE, MegamonsItems.RAW_BLASTOISINITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEX, MegamonsItems.RAW_CHARIZARDITEX));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_CHARIZARDITEY, MegamonsItems.RAW_CHARIZARDITEY));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_GENGARITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_GENGARITE, MegamonsItems.RAW_GENGARITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_GYARADOSITE, MegamonsItems.RAW_GYARADOSITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_KANGASKHANITE, MegamonsItems.RAW_KANGASKHANITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEX, MegamonsItems.RAW_MEWTWONITEX));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_MEWTWONITEY, MegamonsItems.RAW_MEWTWONITEY));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_PIDGEOTITE, MegamonsItems.RAW_PIDGEOTITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_PINSIRITE, MegamonsItems.RAW_PINSIRITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_SLOWBRONITE, MegamonsItems.RAW_SLOWBRONITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_VENUSAURITE, MegamonsItems.RAW_VENUSAURITE));
        // Gen 2
        addDrop(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_AMPHAROSITE, MegamonsItems.RAW_AMPHAROSITE));
        // TODO: Add Heracronite
        // TODO: Add Houndoominite
        addDrop(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_SCIZORITE, MegamonsItems.RAW_SCIZORITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_STEELIXITE, MegamonsItems.RAW_STEELIXITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_TYRANITARITE, MegamonsItems.RAW_TYRANITARITE));
        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite
        addDrop(MegamonsBlocks.ORE_CRYSTAL_BANETTITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_BANETTITE, MegamonsItems.RAW_BANETTITE));
        // TODO: Add Blazikenite
        // TODO: Add Cameruptite
        addDrop(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_GARDEVOIRITE, MegamonsItems.RAW_GARDEVOIRITE));
        addDrop(MegamonsBlocks.ORE_CRYSTAL_GLALITITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_GLALITITE, MegamonsItems.RAW_GLALITITE));
        // TODO: Add Latiasite
        // TODO: Add Latiosite
        addDrop(MegamonsBlocks.ORE_CRYSTAL_MAWILITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_MAWILITE, MegamonsItems.RAW_MAWILITE));
        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite
        addDrop(MegamonsBlocks.ORE_CRYSTAL_SABLENITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_SABLENITE, MegamonsItems.RAW_SABLENITE));
        // TODO: Add Salamencite
        // TODO: Add Sceptilite
        addDrop(MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_SHARPEDONITE, MegamonsItems.RAW_SHARPEDONITE));
        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite
        // TODO: Add Galladite
        addDrop(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE, megastoneOreDrops(MegamonsBlocks.ORE_CRYSTAL_GARCHOMPITE, MegamonsItems.RAW_GARCHOMPITE));
        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+


        // Geode Crystal Evo ores
        addDrop(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_DAWN_STONE_ORE, CobblemonItems.DAWN_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_DUSK_STONE_ORE, CobblemonItems.DUSK_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_FIRE_STONE_ORE, CobblemonItems.FIRE_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_ICE_STONE_ORE, CobblemonItems.ICE_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_LEAF_STONE_ORE, CobblemonItems.LEAF_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_MOON_STONE_ORE, CobblemonItems.MOON_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_SHINY_STONE_ORE, CobblemonItems.SHINY_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_SUN_STONE_ORE, CobblemonItems.SUN_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_THUNDER_STONE_ORE, CobblemonItems.THUNDER_STONE));
        addDrop(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE, megastoneOreDrops(MegamonsBlocks.CRYSTAL_WATER_STONE_ORE, CobblemonItems.WATER_STONE));

        // Megastone Geode Block
        addDrop(MegamonsBlocks.ANISTARITE_GEODE_BLOCK);
        addDrop(MegamonsBlocks.ANISTARITE_ROUGH_GEODE_BLOCK);


    }


    public LootTable.Builder megastoneOreDrops(Block drop, Item item) {
        return dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ItemEntry.builder(item)
                        .apply(SetCountLootFunction.
                                builder(ConstantLootNumberProvider.
                                        create(1.0F)))));
    }

}
