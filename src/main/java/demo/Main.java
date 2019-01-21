package demo;

import character_factory.RandomFactory;
import com.google.common.collect.Maps;
import game_characters.GameCharacter;
import org.reflections.Reflections;

import java.util.Set;

public class Main {
    public static void main(String[] args){
        RandomFactory gc_rf = new RandomFactory();

        GameCharacter gc1 = gc_rf.createCharacter();
        GameCharacter gc2 = gc_rf.createCharacter();

        while(gc1.isAlive()){
            gc1.kick(gc2);
            if (gc2.isAlive()){
                gc2.kick(gc1);
            }
        }
    }
}
