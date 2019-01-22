package demo;

import character_factory.RandomFactory;
import game_characters.Elf;
import game_characters.GameCharacter;
import game_characters.Hobbit;


public class Main {
    public static void main(String[] args){
        RandomFactory gc_rf = new RandomFactory();

        GameCharacter gc1 = gc_rf.createCharacter();
        GameCharacter gc2 = gc_rf.createCharacter();

        System.out.println(gc1.toString());
        System.out.println(gc2.toString() + '\n');

        if (gc1.getClass() == Hobbit.class & gc2.getClass() == Hobbit.class){
            System.out.println("Two Hobbits just met.");
        }

        if ((gc1.getClass() == Elf.class)
                & (gc2.getClass() == Elf.class)
                & (gc1.getPower() == gc2.getPower())){
            System.out.println("Two Elfs won't fight as they have equal powers.");
        }

        else{
            while(gc1.isAlive()){
            gc1.kick(gc2);
                if (gc2.isAlive()) {
                    gc2.kick(gc1);
                } else { break;}
            }
        }

    }
}


// ToDo:
// import org.reflections.Reflections;
// import java.util.Set;