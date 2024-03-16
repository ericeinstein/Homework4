package Macronutirents;

public abstract class AbstractFactory {
    public abstract Carbs createCarbs();

    public abstract Protein createProtein();

    public abstract Fats createFats();
}
