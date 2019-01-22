package game_characters;


import kick_behaviour.KickBehaviour;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
//@ToString
public abstract class GameCharacter {

    private int power;
    private int hp;
    private KickBehaviour kick_behaviour;
    private String name;

    public GameCharacter(int power, int hp, KickBehaviour kick_behaviour) {
        this.power = power;
        this.hp = hp;
        this.kick_behaviour = kick_behaviour;
        this.name = "GC";
    }

    public void kick(GameCharacter another_gc){ kick_behaviour.kick(this, another_gc); }

    public boolean isAlive() { return hp > 0; }

    public String toString() {
        return this.name + " pow: " + Integer.toString(this.power) + ", xp: " + Integer.toString(this.hp);
    }

    public void setHp(int hp){
        if (hp < 0){
            hp = 0;
        }
        this.hp = hp; }
}