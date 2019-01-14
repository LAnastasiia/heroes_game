package factory;
// factory -- replaces constructor -- generates classes

import config.Config;
import game_characters.*;
import java.util.HashMap;


public class GameCharacterFactory {
//WITH HASH MAP

//    public static HashMap<Integer, Class<? extends GameCharacter>> hm = new HashMap<>();
//
//    public GameCharacterFactory(){
//        hm.put(0, Hobbit.class);
//        hm.put(1, Elf.class);
//        hm.put(2, King.class);
//        hm.put(2, Knight.class);
//    }
//
//    public Class<? extends GameCharacter> createCharacter() throws IllegalAccessException, InstantiationException{
//        return hm.get(Config.generateRandom(0, hm.size() - 1));
//    }

}



// better:
    // REFLECTION find class descendants
