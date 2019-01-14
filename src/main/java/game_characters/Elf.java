package game_characters;

import behaviour.CryBehaviour;

public class Elf extends GameCharacter{
    public Elf() {
        super(10, 10, new CryBehaviour());
    }

    public void kick(GameCharacter another_gc){
        if (this.getPower() > another_gc.getPower()){
            another_gc.setHp(0);
        }
    }
}
