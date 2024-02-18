package git.dragomordor.megamons.item.custom;

import com.cobblemon.mod.common.Cobblemon;
import com.cobblemon.mod.common.CobblemonSounds;
import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.api.storage.NoPokemonStoreException;
import com.cobblemon.mod.common.api.storage.party.PartyPosition;
import com.cobblemon.mod.common.api.storage.party.PlayerPartyStore;
import com.cobblemon.mod.common.api.storage.pc.PCStore;
import com.cobblemon.mod.common.entity.pokemon.PokemonEntity;
import com.cobblemon.mod.common.pokemon.Pokemon;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megamons.config.ModConfig;
import git.dragomordor.megamons.item.list.MegastoneItemList;
import git.dragomordor.megamons.util.megaspecies.HeldMegastoneMegaSpeciesUtil;
import git.dragomordor.megamons.util.megaspecies.MegaSpeciesUtil;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;

import java.util.List;

public class MegaCuffItem extends PokemonUseItem{
    public MegaCuffItem() {
        super(new FabricItemSettings().maxCount(1));
    }

    @Override
    public ActionResult processInteraction(ItemStack itemStack, PlayerEntity player, PokemonEntity target, Pokemon pokemon) throws NoPokemonStoreException {

        // has no held item
        if (pokemon.heldItemNoCopy$common().isEmpty()) {
            player.sendMessage(Text.translatable("message.megacuffitem.nohelditem"),true);
            return ActionResult.FAIL;
        }
        // Has held item
        // Get held item info
        ItemStack HeldItemStack = pokemon.heldItemNoCopy$common();
        Item HeldItemItem = HeldItemStack.getItem();
        Text HeldItemText = HeldItemStack.getName();

        // Check if held item is in list of MegaStone Items
        boolean isHeldItemMegaStone = isInMegaStoneList(HeldItemItem, new MegastoneItemList().getMegastonesItemList());

        // if held item is not megastone, return fail
        if (!isHeldItemMegaStone) {
            player.sendMessage(Text.translatable("message.megacuffitem.notamegastone"),true);
            return ActionResult.FAIL;
        }

        // Held item is a megastone!

        // redundant, but makes syntax better
        Item heldMegastone = HeldItemItem;

        // get applicable pokemon species for megastone
        Species applicablePreEvolutionSpecies = HeldMegastoneMegaSpeciesUtil.getApplicablePokemonPreEvolutionSpeciesFromMegastone(heldMegastone);
        Species applicablePostEvolutionSpecies = HeldMegastoneMegaSpeciesUtil.getApplicablePokemonPostEvolutionSpeciesFromMegastone(heldMegastone);

        // if either return weedle, megastone has no associated Pokémon
        Species weedle = PokemonSpecies.INSTANCE.getByName("weedle");
        if ((applicablePreEvolutionSpecies.equals(weedle)) || (applicablePostEvolutionSpecies.equals(weedle))) {
            player.sendMessage(Text.translatable("message.megacuffitem.megastonehasnopokemon"),true);
            return ActionResult.FAIL;
        }

        // Megastone has species associated to it
        // check whether Pokémon is either pre or post mega species
        if ((pokemon.getSpecies().equals(applicablePreEvolutionSpecies) || pokemon.getSpecies().equals(applicablePostEvolutionSpecies))) {
           // Pokémon is correct species for megastone
            // redundancy for syntax
            Species nonMegaSpecies = applicablePreEvolutionSpecies;
            Species MegaSpecies = applicablePostEvolutionSpecies;

            int numberOfMegaPokemonAllowed = ModConfig.getNumberOfMegaPokemonAllowed();

            if (numberOfMegaPokemonAllowed<=0) {
                player.sendMessage(Text.translatable("message.megacuffitem.nomegasallowed"),true);
                return ActionResult.FAIL;
            }



            if (pokemon.getSpecies().equals(nonMegaSpecies)) {
                int playerMegaCount = 0;
                // Check if the current Mega Pokémon is in the player's Party
                // Get list of all mega Pokémon
                List<String> MegaPokemonToCheck = MegaSpeciesUtil.getMegaSpecies();

                // Get players Pokémon in party and pc
                PlayerPartyStore pokemonInParty =  Cobblemon.INSTANCE.getStorage().getParty(player.getUuid());
                PCStore pokemonInPc = Cobblemon.INSTANCE.getStorage().getPC(player.getUuid());
                for (int partySlot = 0; partySlot <= 5; partySlot++) {
                    PartyPosition partyPosition = new PartyPosition(partySlot);
                    Pokemon pokemonInSlot = pokemonInParty.get(partyPosition);
                    if (pokemonInSlot!=null) {
                        if (MegaPokemonToCheck.contains(pokemonInSlot.getSpecies().toString())) {
                            // Pokémon in party is a mega Pokémon
                            playerMegaCount++; // increase number of Mega Pokémon detected
                            if (playerMegaCount>=numberOfMegaPokemonAllowed) {
                                player.sendMessage(Text.translatable("message.megacuffitem.maxmegas"),true);
                                return ActionResult.FAIL;
                            }
                        }
                    }
                }
                // Check if Mega Pokémon is in pc
                for (Pokemon pokemonToCheck: pokemonInPc) {
                    if (pokemonToCheck!=null) {
                        // Check whether any mega Pokémon are in pc
                        if (MegaPokemonToCheck.contains(pokemonToCheck.getSpecies().toString())) {
                            // Mega Pokémon is in pc
                            playerMegaCount++;
                            if (playerMegaCount>=numberOfMegaPokemonAllowed) {
                                player.sendMessage(Text.translatable("message.megacuffitem.maxmegas"),true);
                                return ActionResult.FAIL;
                            }
                        }
                    }
                }
            }

            // Come this far, you evolve
            if (pokemon.getSpecies().equals(nonMegaSpecies)) {
                evolveToMega(pokemon, nonMegaSpecies, MegaSpecies, player);
                return ActionResult.SUCCESS;
            }
            if (pokemon.getSpecies().equals(MegaSpecies)) {
                devolveFromMega(pokemon, nonMegaSpecies, MegaSpecies, player);
                return ActionResult.SUCCESS;
            }

        } else { // Pokémon is wrong species for megastone
            player.sendMessage(Text.translatable("message.megacuffitem.wrongmegastone"),true);
            return ActionResult.FAIL;
        }

        // How did I even get here?
        player.sendMessage(Text.of("Oopsie?"), true);

        System.out.println("How did I get here?");
        return ActionResult.FAIL;
    }


    // function to check if held item is in list of megastones
    public static boolean isInMegaStoneList(Item heldItem, List<Item> megastoneList) {
        for (Item megastone: megastoneList) {
            if (megastone.equals(heldItem)) {
                return true; // Held item is a mega stone
            }
        }
        return false; // Held item is not a mega stone
    }


    public static void evolveToMega(Pokemon pokemon, Species nonMegaSpecies, Species MegaSpecies, PlayerEntity player) {
        pokemon.setSpecies(MegaSpecies);
        String capitalizedSpeciesName = nonMegaSpecies.getName().substring(0, 1).toUpperCase() + nonMegaSpecies.getName().substring(1);
        player.sendMessage(Text.translatable("message.megacuffitem.transformtomega",capitalizedSpeciesName),true);
        player.playSound(CobblemonSounds.EVOLVING, SoundCategory.NEUTRAL, 1F, 1F);
    }

    public static void devolveFromMega(Pokemon pokemon, Species nonMegaSpecies, Species MegaSpecies, PlayerEntity player) {
        pokemon.setSpecies(nonMegaSpecies);
        String capitalizedSpeciesName = nonMegaSpecies.getName().substring(0, 1).toUpperCase() + nonMegaSpecies.getName().substring(1);
        player.sendMessage(Text.translatable("message.megacuffitem.transformtononmega",capitalizedSpeciesName),true);
        player.playSound(CobblemonSounds.EVOLVING, SoundCategory.NEUTRAL, 1F, 0.1F);
    }

}
