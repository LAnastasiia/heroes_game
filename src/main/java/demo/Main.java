package demo;

import com.sun.org.apache.xpath.internal.operations.String;
import game_characters.GameCharacter;
import org.reflections.Reflections;

import java.util.Set;

public class Main {
    public static void main(String[] args){
        Reflections reflections = new Reflections();
        Set<Class<? extends GameCharacter>> subTypes = reflections.getSubTypesOf(GameCharacter.class);
        System.out.println(subTypes);
    }
}
