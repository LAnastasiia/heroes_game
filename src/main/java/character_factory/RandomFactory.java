package character_factory;

import config.Config;
import game_characters.*;
import lombok.SneakyThrows;
import java.util.HashMap;

import java.util.Set;
import org.reflections.Reflections;



public class RandomFactory{

    private HashMap<Integer, Class<? extends GameCharacter>> gc_hm = new HashMap<Integer, Class<? extends GameCharacter>>();

    public RandomFactory() {
        gc_hm.put(1, Hobbit.class);
        gc_hm.put(2, Elf.class);
        gc_hm.put(3, King.class);
        gc_hm.put(4, Knight.class);
    }

    @SneakyThrows
    public GameCharacter createCharacter() {
        return gc_hm.get(Config.generateRandom(1, gc_hm.size())).getDeclaredConstructor().newInstance();
    }
}


// ToDo:
// Reflections reflections = new Reflections("game_characters.package");
// Set<Class<? extends GameCharacter>> subTypes = reflections.getSubTypesOf(GameCharacter.class);
// System.out.println(subTypes);