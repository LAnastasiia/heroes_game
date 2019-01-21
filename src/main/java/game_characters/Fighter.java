package game_characters;
import behaviour.KickRandomlyBehaviour;
import config.Config;


public abstract class Fighter extends GameCharacter {     // random power, hp in range(5, 15) + random kick

    public Fighter(int min, int max) {
        super(Config.generateRandom(min, max), Config.generateRandom(min, max), new KickRandomlyBehaviour());
    }

}
