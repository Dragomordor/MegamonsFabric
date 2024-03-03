package git.dragomordor.megamons.tags;

import git.dragomordor.megamons.MegamonsMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> ORE_MEGASTONES =
                createTag("ore_megastones");

        public static final TagKey<Block> GEODE_WALLS =
                createTag("geode_walls");

        private static TagKey<Block> createTag(String name) {
            return  TagKey.of(RegistryKeys.BLOCK, new Identifier(MegamonsMod.MODID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> RAW_MEGASTONES =
                createTag("raw_megastones");
        public static final TagKey<Item> CUT_MEGASTONES =
                        createTag("cut_megastones");
        public static final TagKey<Item> ORE_MEGASTONES =
                createTag("ore_megastones");

        // Mega Stones
        public static final TagKey<Item> GEN1_CUT_MEGASTONES =
                createTag("gen1_cut_megastones");
        public static final TagKey<Item> GEN2_CUT_MEGASTONES =
                createTag("gen2_cut_megastones");
        private static TagKey<Item> createTag(String name) {
            return  TagKey.of(RegistryKeys.ITEM, new Identifier(MegamonsMod.MODID, name));
        }
    }

    public static class Biomes {
        public static final TagKey<Biome> AERODACTYLITE_TAG = createTag("aerodactylite_tag");



        private static TagKey<Biome> createTag(String name) {
            return  TagKey.of(RegistryKeys.BIOME, new Identifier(MegamonsMod.MODID, name));
        }
    }



}
