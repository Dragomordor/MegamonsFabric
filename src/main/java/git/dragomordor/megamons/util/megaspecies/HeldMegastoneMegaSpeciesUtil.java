package git.dragomordor.megamons.util.megaspecies;

import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megamons.item.MegamonsItems;
import net.minecraft.item.Item;

public class HeldMegastoneMegaSpeciesUtil {

    public static Species getApplicablePokemonPreEvolutionSpeciesFromMegastone(Item heldMegastone) {

        // Gen 1
        // Alakazite
        if (heldMegastone.equals(MegamonsItems.CUT_ALAKAZITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AlakazitePreEvolution);
        }
        // Aerodactyl
        if (heldMegastone.equals(MegamonsItems.CUT_AERODACTYLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AerodactylitePreEvolution);
        }
        // Beedrill
        if (heldMegastone.equals(MegamonsItems.CUT_BEEDRILLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BeedrillitePreEvolution);
        }
        // Blastoise
        if (heldMegastone.equals(MegamonsItems.CUT_BLASTOISINITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BlastoisinitePreEvolution);
        }
        // Charizard X
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeXPreEvolution);
        }
        // Charizard Y
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeYPreEvolution);
        }
        // Gengar
        if (heldMegastone.equals(MegamonsItems.CUT_GENGARITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GengaritePreEvolution);
        }
        // Gyarados
        if (heldMegastone.equals(MegamonsItems.CUT_GYARADOSITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GyaradositePreEvolution);
        }
        // Kangaskhan
        if (heldMegastone.equals(MegamonsItems.CUT_KANGASKHANITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.KangaskhanitePreEvolution);
        }
        // Mewtwo X
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteXPreEvolution);
        }
        // Mewtwo Y
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteYPreEvolution);
        }
        // Pidgeot
        if (heldMegastone.equals(MegamonsItems.CUT_PIDGEOTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PidgeotitePreEvolution);
        }
        // Pinsir
        if (heldMegastone.equals(MegamonsItems.CUT_PINSIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PinsiritePreEvolution);
        }
        // Slowbro
        if (heldMegastone.equals(MegamonsItems.CUT_SLOWBRONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SlowbronitePreEvolution);
        }
        // Venusaur
        if (heldMegastone.equals(MegamonsItems.CUT_VENUSAURITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.VenusauritePreEvolution);
        }
        // Gen 2
        // Ampharos
        if (heldMegastone.equals(MegamonsItems.CUT_AMPHAROSITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AmpharositePreEvolution);
        }
        // Banette
        if (heldMegastone.equals(MegamonsItems.CUT_BANETTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BanettitePreEvolution);
        }
        // Gardevoir
        if (heldMegastone.equals(MegamonsItems.CUT_GARDEVOIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GardevoiritePreEvolution);
        }
        // Garchomp
        if (heldMegastone.equals(MegamonsItems.CUT_GARCHOMPITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GarchompitePreEvolution);
        }
        // Glalie
        if (heldMegastone.equals(MegamonsItems.CUT_GLALITITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GlalititePreEvolution);
        }
        // Mawile
        if (heldMegastone.equals(MegamonsItems.CUT_MAWILITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MawilitePreEvolution);
        }
        // Sableye
        if (heldMegastone.equals(MegamonsItems.CUT_SABLENITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SablenitePreEvolution);
        }
        // Scizor
        if (heldMegastone.equals(MegamonsItems.CUT_SCIZORITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.ScizoritePreEvolution);
        }
        // Sharpedo
        if (heldMegastone.equals(MegamonsItems.CUT_SHARPEDONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SharpedonitePreEvolution);
        }
        // Steelix
        if (heldMegastone.equals(MegamonsItems.CUT_STEELIXITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SteelixitePreEvolution);
        }
        // Tyranitar
        if (heldMegastone.equals(MegamonsItems.CUT_TYRANITARITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.TyranitaritePreEvolution);
        }


        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

    public static Species getApplicablePokemonPostEvolutionSpeciesFromMegastone(Item heldMegastone) {

        // Gen 1
        // Alakazite
        if (heldMegastone.equals(MegamonsItems.CUT_ALAKAZITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AlakazitePostEvolution);
        }

        // Aerodactyl
        if (heldMegastone.equals(MegamonsItems.CUT_AERODACTYLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AerodactylitePostEvolution);
        }
        // Beedrill
        if (heldMegastone.equals(MegamonsItems.CUT_BEEDRILLITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BeedrillitePostEvolution);
        }
        // Blastois
        if (heldMegastone.equals(MegamonsItems.CUT_BLASTOISINITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BlastoisinitePostEvolution);
        }
        // Charizard X
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeXPostEvolution);
        }
        // Charizard Y
        if (heldMegastone.equals(MegamonsItems.CUT_CHARIZARDITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.CharizarditeYPostEvolution);
        }
        // Gengar
        if (heldMegastone.equals(MegamonsItems.CUT_GENGARITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GengaritePostEvolution);
        }
        // Gyarados
        if (heldMegastone.equals(MegamonsItems.CUT_GYARADOSITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GyaradositePostEvolution);
        }
        // Kangaskhan
        if (heldMegastone.equals(MegamonsItems.CUT_KANGASKHANITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.KangaskhanitePostEvolution);
        }
        // Mewtwo X
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEX)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteXPostEvolution);
        }
        // Mewtwo Y
        if (heldMegastone.equals(MegamonsItems.CUT_MEWTWONITEY)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MewtwoniteYPostEvolution);
        }
        // Pidgeot
        if (heldMegastone.equals(MegamonsItems.CUT_PIDGEOTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PidgeotitePostEvolution);
        }
        // Pinsir
        if (heldMegastone.equals(MegamonsItems.CUT_PINSIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.PinsiritePostEvolution);
        }
        // Slowbro
        if (heldMegastone.equals(MegamonsItems.CUT_SLOWBRONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SlowbronitePostEvolution);
        }
        // Venusaur
        if (heldMegastone.equals(MegamonsItems.CUT_VENUSAURITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.VenusauritePostEvolution);
        }
        // Gen 2
        // Ampharos
        if (heldMegastone.equals(MegamonsItems.CUT_AMPHAROSITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.AmpharositePostEvolution);
        }
        // Banette
        if (heldMegastone.equals(MegamonsItems.CUT_BANETTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BanettitePostEvolution);
        }
        // Gardevoir
        if (heldMegastone.equals(MegamonsItems.CUT_GARDEVOIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GardevoiritePostEvolution);
        }
        // Garchomp
        if (heldMegastone.equals(MegamonsItems.CUT_GARCHOMPITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GarchompitePostEvolution);
        }
        // Glalie
        if (heldMegastone.equals(MegamonsItems.CUT_GLALITITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GlalititePostEvolution);
        }
        // Mawile
        if (heldMegastone.equals(MegamonsItems.CUT_MAWILITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MawilitePostEvolution);
        }
        // Sableye
        if (heldMegastone.equals(MegamonsItems.CUT_SABLENITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SablenitePostEvolution);
        }
        // Scizor
        if (heldMegastone.equals(MegamonsItems.CUT_SCIZORITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.ScizoritePostEvolution);
        }
        // Sharpedo
        if (heldMegastone.equals(MegamonsItems.CUT_SHARPEDONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SharpedonitePostEvolution);
        }
        // Steelix
        if (heldMegastone.equals(MegamonsItems.CUT_STEELIXITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SteelixitePostEvolution);
        }
        // Tyranitar
        if (heldMegastone.equals(MegamonsItems.CUT_TYRANITARITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.TyranitaritePostEvolution);
        }
        // Gen 3

        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

}
