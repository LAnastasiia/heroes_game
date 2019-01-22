package kick_behaviour;

import game_characters.GameCharacter;

public class KickCryBehaviour implements KickBehaviour{
    public void kick(GameCharacter gc1, GameCharacter gc2) {
        System.out.println(gc1.getName() + " Cry...");
    }
}
