package Macronutirents;

import java.util.Random;

public class FatsFactory implements Fats {
    private static FatsFactory instance = new FatsFactory();
    private static final String[] options = { "Avocado", "Sour cream", "Tuna", "Peanuts" };

    private FatsFactory() {
    }

    public static FatsFactory getInstance() {
        return instance;
    }

    @Override
    public String getFats() {
        Random random = new Random();
        return options[random.nextInt(options.length)];
    }
}
