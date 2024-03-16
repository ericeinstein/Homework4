package Macronutirents;

import java.util.Random;

public class CarbFactory implements Carbs {
    private static CarbFactory instance = new CarbFactory();
    private static final String[] options = { "Cheese", "Bread", "Lentils", "Pistachio" };

    private CarbFactory() {
    }

    public static CarbFactory getInstance() {
        return instance;
    }

    @Override
    public String getCarb() {
        Random random = new Random();
        return options[random.nextInt(options.length)];
    }
}
