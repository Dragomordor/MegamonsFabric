package git.dragomordor.megamons.util.megaspecies;

import com.cobblemon.mod.common.api.pokemon.PokemonSpecies;
import com.cobblemon.mod.common.pokemon.Species;
import git.dragomordor.megamons.item.MegamonsItems;
import net.minecraft.item.Item;

public class HeldMegastoneMegaSpeciesUtil {

    public static Species getApplicablePokemonPreEvolutionSpeciesFromMegastone(Item heldMegastone) {
        // TODO: improve this method

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
        // TODO: Add Heracroite
        // TODO: Add Houndoominite
        // Scizor
        if (heldMegastone.equals(MegamonsItems.CUT_SCIZORITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.ScizoritePreEvolution);
        }
        // Steelix
        if (heldMegastone.equals(MegamonsItems.CUT_STEELIXITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SteelixitePreEvolution);
        }
        // Tyranitar
        if (heldMegastone.equals(MegamonsItems.CUT_TYRANITARITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.TyranitaritePreEvolution);
        }
        // Gen 3
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite
        // Banette
        if (heldMegastone.equals(MegamonsItems.CUT_BANETTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BanettitePreEvolution);
        }
        // TODO: Add Blazikenite
        // TODO: Add Cameruptite
        // Gardevoir
        if (heldMegastone.equals(MegamonsItems.CUT_GARDEVOIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GardevoiritePreEvolution);
        }
        // Glalie
        if (heldMegastone.equals(MegamonsItems.CUT_GLALITITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GlalititePreEvolution);
        }
        // TODO: Add Latiasite
        // TODO: Add Latiosite
        // Mawile
        if (heldMegastone.equals(MegamonsItems.CUT_MAWILITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MawilitePreEvolution);
        }
        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite
        // Sableye
        if (heldMegastone.equals(MegamonsItems.CUT_SABLENITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SablenitePreEvolution);
        }
        // TODO: Add Salamencite
        // TODO: Add Sceptilite
        // Sharpedo
        if (heldMegastone.equals(MegamonsItems.CUT_SHARPEDONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SharpedonitePreEvolution);
        }
        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite
        // Gallade
        if (heldMegastone.equals(MegamonsItems.CUT_GALLADITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GalladitePreEvolution);
        }
        // Garchomp
        if (heldMegastone.equals(MegamonsItems.CUT_GARCHOMPITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GarchompitePreEvolution);
        }
        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+


        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

    public static Species getApplicablePokemonPostEvolutionSpeciesFromMegastone(Item heldMegastone) {
        // TODO: improve this method


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
        // TODO: Add Heracroite
        // TODO: Add Houndoominite
        // Scizor
        if (heldMegastone.equals(MegamonsItems.CUT_SCIZORITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.ScizoritePostEvolution);
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
        // TODO: Add Absolite
        // TODO: Add Aggronite
        // TODO: Add Altarianite
        // Banette
        if (heldMegastone.equals(MegamonsItems.CUT_BANETTITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.BanettitePostEvolution);
        }
        // TODO: Add Blazikenite
        // TODO: Add Cameruptite
        // Gardevoir
        if (heldMegastone.equals(MegamonsItems.CUT_GARDEVOIRITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GardevoiritePostEvolution);
        }
        // Glalie
        if (heldMegastone.equals(MegamonsItems.CUT_GLALITITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GlalititePostEvolution);
        }
        // TODO: Add Latiasite
        // TODO: Add Latiosite
        // Mawile
        if (heldMegastone.equals(MegamonsItems.CUT_MAWILITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.MawilitePostEvolution);
        }
        // TODO: Add Manechtite
        // TODO: Add Medichamite
        // TODO: Add Metagrossite
        // TODO: Add Rayquazite
        // Sableye
        if (heldMegastone.equals(MegamonsItems.CUT_SABLENITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SablenitePostEvolution);
        }
        // TODO: Add Salamencite
        // TODO: Add Sceptilite
        // Sharpedo
        if (heldMegastone.equals(MegamonsItems.CUT_SHARPEDONITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.SharpedonitePostEvolution);
        }
        // TODO: Add Swampertite
        // Gen 4
        // TODO: Add Abomasite
        // Gallade
        if (heldMegastone.equals(MegamonsItems.CUT_GALLADITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GalladitePostEvolution);
        }
        // Garchomp
        if (heldMegastone.equals(MegamonsItems.CUT_GARCHOMPITE)) {
            return PokemonSpecies.INSTANCE.getByName(MegaSpeciesUtil.GarchompitePostEvolution);
        }
        // TODO: Add Lopunnite
        // TODO: Add Lucarionite
        // Gen 5
        // TODO: Add Audinite
        // Gen 6
        // TODO: Add Diancite
        // Gen 7+


        // Default, held item is not in mega stone list (need to return something, not null)
        return PokemonSpecies.INSTANCE.getByName("weedle");
    }

}
