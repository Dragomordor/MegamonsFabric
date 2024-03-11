package git.dragomordor.megamons.item;

import git.dragomordor.megamons.MegamonsMod;
import git.dragomordor.megamons.item.custom.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class MegamonsItems {

    // register RawMegaStoneItem
        // Gen 1
    public static final RawMegaStoneItem RAW_AERODACTYLITE = registerRawMegaStoneItem("raw_aerodactylite",new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_ALAKAZITE = registerRawMegaStoneItem("raw_alakazite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_BEEDRILLITE = registerRawMegaStoneItem("raw_beedrillite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_BLASTOISINITE = registerRawMegaStoneItem("raw_blastoisinite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_CHARIZARDITEX = registerRawMegaStoneItem("raw_charizarditex", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_CHARIZARDITEY = registerRawMegaStoneItem("raw_charizarditey", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_GENGARITE = registerRawMegaStoneItem("raw_gengarite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_GYARADOSITE = registerRawMegaStoneItem("raw_gyaradosite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_KANGASKHANITE = registerRawMegaStoneItem("raw_kangaskhanite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_MEWTWONITEX = registerRawMegaStoneItem("raw_mewtwonitex", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_MEWTWONITEY = registerRawMegaStoneItem("raw_mewtwonitey", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_PIDGEOTITE = registerRawMegaStoneItem("raw_pidgeotite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_PINSIRITE = registerRawMegaStoneItem("raw_pinsirite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_SLOWBRONITE = registerRawMegaStoneItem("raw_slowbronite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_VENUSAURITE = registerRawMegaStoneItem("raw_venusaurite", new RawMegaStoneItem());
        // Gen 2
    public static final RawMegaStoneItem RAW_AMPHAROSITE = registerRawMegaStoneItem("raw_ampharosite", new RawMegaStoneItem());
    // TODO: Add Heracroite
    // TODO: Add Houndoominite
    public static final RawMegaStoneItem RAW_SCIZORITE = registerRawMegaStoneItem("raw_scizorite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_STEELIXITE = registerRawMegaStoneItem("raw_steelixite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_TYRANITARITE = registerRawMegaStoneItem("raw_tyranitarite", new RawMegaStoneItem());
        // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
        public static final RawMegaStoneItem RAW_BANETTITE = registerRawMegaStoneItem("raw_banettite", new RawMegaStoneItem());
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final RawMegaStoneItem RAW_GARDEVOIRITE = registerRawMegaStoneItem("raw_gardevoirite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_GLALITITE = registerRawMegaStoneItem("raw_glalitite", new RawMegaStoneItem());
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final RawMegaStoneItem RAW_MAWILITE = registerRawMegaStoneItem("raw_mawilite", new RawMegaStoneItem());
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final RawMegaStoneItem RAW_SABLENITE = registerRawMegaStoneItem("raw_sablenite", new RawMegaStoneItem());
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final RawMegaStoneItem RAW_SHARPEDONITE = registerRawMegaStoneItem("raw_sharpedonite", new RawMegaStoneItem());
    // TODO: Add Swampertite
        // Gen 4
    // TODO: Add Abomasite
    public static final RawMegaStoneItem RAW_GALLADITE = registerRawMegaStoneItem("raw_galladite", new RawMegaStoneItem());
    public static final RawMegaStoneItem RAW_GARCHOMPITE = registerRawMegaStoneItem("raw_garchompite", new RawMegaStoneItem());
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
        // Gen 5
    // TODO: Add Audinite
        // Gen 6
    // TODO: Add Diancite
        // Gen 7+


    // register CutMegaStoneItem
        // Gen 1
    public static final CutMegaStoneItem CUT_ALAKAZITE = registerCutMegaStoneItem("cut_alakazite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_AERODACTYLITE = registerCutMegaStoneItem("cut_aerodactylite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_BEEDRILLITE = registerCutMegaStoneItem("cut_beedrillite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_BLASTOISINITE = registerCutMegaStoneItem("cut_blastoisinite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_CHARIZARDITEX = registerCutMegaStoneItem("cut_charizarditex", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_CHARIZARDITEY = registerCutMegaStoneItem("cut_charizarditey", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_GENGARITE = registerCutMegaStoneItem("cut_gengarite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_GYARADOSITE = registerCutMegaStoneItem("cut_gyaradosite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_KANGASKHANITE = registerCutMegaStoneItem("cut_kangaskhanite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_MEWTWONITEX = registerCutMegaStoneItem("cut_mewtwonitex", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_MEWTWONITEY = registerCutMegaStoneItem("cut_mewtwonitey", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_PIDGEOTITE = registerCutMegaStoneItem("cut_pidgeotite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_PINSIRITE = registerCutMegaStoneItem("cut_pinsirite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_SLOWBRONITE = registerCutMegaStoneItem("cut_slowbronite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_VENUSAURITE = registerCutMegaStoneItem("cut_venusaurite", new CutMegaStoneItem());
        // Gen 2
    public static final CutMegaStoneItem CUT_AMPHAROSITE = registerCutMegaStoneItem("cut_ampharosite", new CutMegaStoneItem());
    // TODO: Add Heracroite
    // TODO: Add Houndoominite
    public static final CutMegaStoneItem CUT_SCIZORITE = registerCutMegaStoneItem("cut_scizorite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_STEELIXITE = registerCutMegaStoneItem("cut_steelixite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_TYRANITARITE = registerCutMegaStoneItem("cut_tyranitarite", new CutMegaStoneItem());
        // Gen 3
    // TODO: Add Absolite
    // TODO: Add Aggronite
    // TODO: Add Altarianite
    public static final CutMegaStoneItem CUT_BANETTITE = registerCutMegaStoneItem("cut_banettite", new CutMegaStoneItem());
    // TODO: Add Blazikenite
    // TODO: Add Cameruptite
    public static final CutMegaStoneItem CUT_GARDEVOIRITE = registerCutMegaStoneItem("cut_gardevoirite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_GLALITITE = registerCutMegaStoneItem("cut_glalitite", new CutMegaStoneItem());
    // TODO: Add Latiasite
    // TODO: Add Latiosite
    public static final CutMegaStoneItem CUT_MAWILITE = registerCutMegaStoneItem("cut_mawilite", new CutMegaStoneItem());
    // TODO: Add Manechtite
    // TODO: Add Medichamite
    // TODO: Add Metagrossite
    // TODO: Add Rayquazite
    public static final CutMegaStoneItem CUT_SABLENITE = registerCutMegaStoneItem("cut_sablenite", new CutMegaStoneItem());
    // TODO: Add Salamencite
    // TODO: Add Sceptilite
    public static final CutMegaStoneItem CUT_SHARPEDONITE = registerCutMegaStoneItem("cut_sharpedonite", new CutMegaStoneItem());
    // TODO: Add Swampertite
    // Gen 4
    // TODO: Add Abomasite
    // TODO: Add Galladite
    public static final CutMegaStoneItem CUT_GALLADITE = registerCutMegaStoneItem("cut_galladite", new CutMegaStoneItem());
    public static final CutMegaStoneItem CUT_GARCHOMPITE = registerCutMegaStoneItem("cut_garchompite", new CutMegaStoneItem());
    // TODO: Add Lopunnite
    // TODO: Add Lucarionite
    // Gen 5
    // TODO: Add Audinite
    // Gen 6
    // TODO: Add Diancite
    // Gen 7+


// Helper method to register items

    // Register KeyStoneItem
    public static final KeyStoneItem KEY_STONE = registerKeyStoneItem("key_stone", new KeyStoneItem());

    // Register Mega Cuff Item
    public static final MegaCuffItem MEGA_CUFF = registerMegaCuffItem("mega_cuff", new MegaCuffItem());

    // register RawMegaStoneItem
    private static RawMegaStoneItem registerRawMegaStoneItem(String name, RawMegaStoneItem rawMegaStoneItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegamonsMod.MODID, name),rawMegaStoneItem);
    }
    // register CutMegaStoneItem
    private static CutMegaStoneItem registerCutMegaStoneItem(String name, CutMegaStoneItem cutMegaStoneItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegamonsMod.MODID, name),cutMegaStoneItem);
    }
   // register KeyStoneItem
    private static KeyStoneItem registerKeyStoneItem(String name, KeyStoneItem keyStoneItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegamonsMod.MODID, name),keyStoneItem);
    }

    // Register Mega cuff
    private static MegaCuffItem registerMegaCuffItem(String name, MegaCuffItem megaCuffItem) {
        return Registry.register(Registries.ITEM, new Identifier(MegamonsMod.MODID, name),megaCuffItem);
    }


    // Other functions
    // Register all mod items
    public static void registerModItems() {
        MegamonsMod.LOGGER.info("Register Mod Items for " + MegamonsMod.MODID) ;
    }




    public static ItemStack getItemStackByName(String name) {
        Identifier identifier = new Identifier(MegamonsMod.MODID, name);
        Item item = Registries.ITEM.get(identifier);
        if (item!=null) {
            return new ItemStack(item);
        } else {
            return ItemStack.EMPTY;
        }

    }

    public static Item getItemByName(String name) {
          Identifier identifier  = new Identifier(MegamonsMod.MODID,name);
        return Registries.ITEM.get(identifier);
    }

}
