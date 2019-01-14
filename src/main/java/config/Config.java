package config;

import java.util.Random;

public class Config {
    private static Random rnd = new Random();
    public static int generateRandom(int min, int max){
        return rnd.nextInt(min + max - 1);
    }
}
