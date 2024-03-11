package git.dragomordor.megamons.event;

public class ModEvents {
    public static void registerEvents() {
        PokemonHeldItemChangeEvent.INSTANCE.register(MegaDevolveEvent::onPokemonHeldItemChange);
    }



}
