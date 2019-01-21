package factory;
// factory -- replaces constructor -- generates classes

import config.Config;
import game_characters.*;
import java.util.HashMap;


public interface GameCharacterFactory {

    public void createCharacter();
}


//    Class<? extends GameCharacter>
// REFLECTION find class descendants
