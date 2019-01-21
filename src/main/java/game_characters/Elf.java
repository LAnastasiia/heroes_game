package game_characters;

import behaviour.KickLikeElfBehaviour;

public class Elf extends GameCharacter{
    public Elf() {
        super(10, 10, new KickLikeElfBehaviour());
    }

}
