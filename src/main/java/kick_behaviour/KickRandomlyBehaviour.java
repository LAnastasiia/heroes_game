package kick_behaviour;
import config.Config;
import game_characters.GameCharacter;
import kick_behaviour.KickBehaviour;

public class KickRandomlyBehaviour implements KickBehaviour {
    public void kick(GameCharacter another_gc) {

    }

    public void kick(GameCharacter gc1, GameCharacter gc2) {
        int kickPower = Config.generateRandom(0, gc1.getPower());
        gc2.setHp(gc2.getHp() - kickPower);
    }
}
