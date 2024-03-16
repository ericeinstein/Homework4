package Macronutirents;

public class MacronutrientFactory extends AbstractFactory {
    private static MacronutrientFactory instance = new MacronutrientFactory();
    private Carbs carbsFactory;
    private Protein proteinFactory;
    private Fats fatsFactory;

    private MacronutrientFactory() {
        carbsFactory = CarbFactory.getInstance();
        proteinFactory = ProteinFactory.getInstance();
        fatsFactory = FatsFactory.getInstance();
    }

    public static MacronutrientFactory getInstance() {
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        return carbsFactory;
    }

    @Override
    public Protein createProtein() {
        return proteinFactory;
    }

    @Override
    public Fats createFats() {
        return fatsFactory;
    }
}
