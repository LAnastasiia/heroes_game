package factory;

import game_characters.GameCharacter;
import org.reflections.Reflections;
import java.util.Set;


public class RandomFactory implements GameCharacterFactory {

    @Override
    public void createCharacter() {
        Reflections reflections = new Reflections("game_characters.package");
        Set<Class<? extends GameCharacter>> subTypes = reflections.getSubTypesOf(GameCharacter.class);
        System.out.println(subTypes);
    }
}
