package game_characters;

import behaviour.CryBehaviour;

public class Hobbit extends GameCharacter{

    public Hobbit(){
        super(0, 3, new CryBehaviour());
    }

    public void kick(){
        toCry();
    }

    public void toCry() {
        System.out.println("Cry, Cry, Cry!");
    }
}
