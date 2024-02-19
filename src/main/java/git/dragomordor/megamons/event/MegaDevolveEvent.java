package git.dragomordor.megamons.event;

import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megamons.item.list.MegastoneItemList;
import git.dragomordor.megamons.util.megaspecies.HeldMegastoneMegaSpeciesUtil;
import git.dragomordor.megamons.util.megaspecies.MegaSpeciesUtil;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;

import java.util.List;

import static git.dragomordor.megamons.item.custom.MegaCuffItem.isInMegaStoneList;
import static git.dragomordor.megamons.util.megaspecies.MegaSpeciesUtil.getPreSpeciesFromPostSpecies;

public class MegaDevolveEvent {

    public static void onPokemonHeldItemChange(Pokemon pokemon, ItemStack previousItemStack, ItemStack newItemStack) {
        MegaDevolveCheck(pokemon);
    }

    private static void MegaDevolveCheck(Pokemon pokemon) {
        Species pokemonSpecies= pokemon.getSpecies();
        String pokemonSpeciesString = pokemonSpecies.getName();
        PlayerEntity player = pokemon.getOwnerPlayer();

        List<String> megaSpeciesString = MegaSpeciesUtil.getMegaSpecies();
        // pokemon is a mega species
        if (megaSpeciesString.contains(pokemonSpeciesString)) {
            ItemStack HeldItemStack = pokemon.heldItemNoCopy$common();
            Item HeldItemItem = HeldItemStack.getItem();
            // Check if held item is in list of MegaStone Items
            boolean isHeldItemMegaStone = isInMegaStoneList(HeldItemItem, new MegastoneItemList().getMegastonesItemList());
            if (!isHeldItemMegaStone) { // if held item is not megastone, devolve pokemon
                DevolveMegaPokemon(pokemon, player);
            }
            // Held item is a megastone
            // get applicable pokemon species for megastone
            Species applicablePostEvolutionSpecies = HeldMegastoneMegaSpeciesUtil.getApplicablePokemonPostEvolutionSpeciesFromMegastone(HeldItemItem);
            // if return weedle, megastone has no associated Pokémon, devolve Pokémon
            Species weedle = PokemonSpecies.INSTANCE.getByName("weedle");
            if (applicablePostEvolutionSpecies.equals(weedle)) {
                DevolveMegaPokemon(pokemon, player);
            }
            // Megastone has species associated to it
            // check whether Pokémon is correct Post Species for Megastone
            if (!(pokemonSpecies.equals(applicablePostEvolutionSpecies))) {
                // Pokemon is not the correct mega species for mega stone
                DevolveMegaPokemon(pokemon, player);
            }
            // Pokémon is correct species for held megastone -- Nothing occurs
        }
        // Pokémon is not a mega species (nothing happens)
    }

    private static void DevolveMegaPokemon(Pokemon pokemon, PlayerEntity player) {
        // Get pokemon species
        Species pokemonSpecies= pokemon.getSpecies();
        String pokemonSpeciesString = pokemonSpecies.getName();
        // Get Non mega species from mega species
        String pokemonPreSpeciesString = getPreSpeciesFromPostSpecies(pokemonSpeciesString);
        Species weedle = PokemonSpecies.INSTANCE.getByName("weedle");

        Species pokemonPreSpecies = PokemonSpecies.INSTANCE.getByName(pokemonPreSpeciesString);
        if (!(pokemonPreSpecies.equals(weedle))) {
            // transform Pokémon to PreSpecies
            pokemon.setSpecies(pokemonPreSpecies);
            String capitalizedSpeciesName = pokemonPreSpecies.getName().substring(0, 1).toUpperCase() + pokemonPreSpecies.getName().substring(1);
            if (player!=null) {
                player.sendMessage(Text.translatable("message.megadevolveevent.stoneremoved",capitalizedSpeciesName),true);
                player.playSound(CobblemonSounds.EVOLVING, SoundCategory.NEUTRAL, 1F, 0.1F);
            }
            pokemon.setTradeable(true);
        }
    }



}
