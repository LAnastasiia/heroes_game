package config;

import java.util.Random;

public class Config {
    private static Random rnd = new Random();  // Minimises amount of unnecessary random classes.

    public static int generateRandom(int min, int max){
        return rnd.nextInt(min + max - 1);
    }
}
