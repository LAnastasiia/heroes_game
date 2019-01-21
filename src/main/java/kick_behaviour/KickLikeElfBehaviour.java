package kick_behaviour;

import game_characters.GameCharacter;

public class KickLikeElfBehaviour implements KickBehaviour{
    public void kick(GameCharacter main_gc, GameCharacter other_gc){
        if (other_gc.getPower() < main_gc.getPower()){
            other_gc.setPower(0);
        }
        else {other_gc.setPower(other_gc.getPower() - 1);}
    }
}
