package Macronutirents;

public class Customer {
    private String name;
    private String dietPlan;

    public Customer(String name, String dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public String getDietPlan() {
        return dietPlan;
    }

    public void requestMeal() {
        AbstractFactory macronutrientFactory = MacronutrientFactory.getInstance();

        Carbs carbs = macronutrientFactory.createCarbs();
        Protein protein = macronutrientFactory.createProtein();
        Fats fats = macronutrientFactory.createFats();

        System.out.println("Meal for " + name + " (" + dietPlan + "):");
        System.out.println("Carb: " + carbs.getCarb());
        System.out.println("Protein: " + protein.getProtein());
        System.out.println("Fats: " + fats.getFats());
        System.out.println();
    }
}
