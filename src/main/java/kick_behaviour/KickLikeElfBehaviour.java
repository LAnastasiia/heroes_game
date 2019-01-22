package kick_behaviour;

import game_characters.GameCharacter;

public class KickLikeElfBehaviour implements KickBehaviour{
    public void kick(GameCharacter main_gc, GameCharacter other_gc){
        if (other_gc.getPower() < main_gc.getPower()){
            other_gc.setHp(0);
            System.out.println(main_gc.getName() + " kills " + other_gc.getName());
        }
        else {other_gc.setPower(other_gc.getPower() - 1);
        System.out.println(other_gc.getName() + "  -1XP"  + "   --> " + other_gc.toString());
        }
    }
}
