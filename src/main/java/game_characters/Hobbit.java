package game_characters;

import behaviour.KickCryBehaviour;

public class Hobbit extends GameCharacter{

    public Hobbit(){
        super(0, 3, new KickCryBehaviour());  // can't fight -- cry, hp=3 (default)
    }

    public void kick(){
        toCry();
    }

    public void toCry() {
        System.out.println("Cry, Cry, Cry!");
    }
}
