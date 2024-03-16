package Macronutirents;

import java.util.Random;

public class ProteinFactory implements Protein {
    private static ProteinFactory instance = new ProteinFactory();
    private static final String[] options = { "Fish", "Chicken", "Beef", "Tofu" };

    private ProteinFactory() {
    }

    public static ProteinFactory getInstance() {
        return instance;
    }

    @Override
    public String getProtein() {
        Random random = new Random();
        return options[random.nextInt(options.length)];
    }
}
