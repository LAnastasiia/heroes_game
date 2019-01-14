package game_characters;
import behaviour.RandomKick;
import config.Config;
import java.util.Random;


public abstract class Fighter extends GameCharacter {

    public Fighter(int min, int max) {
        super(Config.generateRandom(min, max), Config.generateRandom(min, max), new RandomKick());
    }

    public void kick(GameCharacter another_gc) {
        int kickPower = Config.generateRandom(0, this.getPower());
        another_gc.setHp(another_gc.getHp() - kickPower);
    }
}
