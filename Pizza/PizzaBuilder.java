package Pizza;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder {
    private String chain;
    private String size;
    private List<Topping> toppings = new ArrayList<>();

    public PizzaBuilder(String chain, String size) {
        this.chain = chain;
        this.size = size;
    }

    public PizzaBuilder addPepperoni() {
        toppings.add(Topping.PEPPERONI);
        return this;
    }

    public PizzaBuilder addSausage() {
        toppings.add(Topping.SAUSAGE);
        return this;
    }

    public PizzaBuilder addMushrooms() {
        toppings.add(Topping.MUSHROOMS);
        return this;
    }

    public PizzaBuilder addBacon() {
        toppings.add(Topping.BACON);
        return this;
    }

    public PizzaBuilder addOnions() {
        toppings.add(Topping.ONIONS);
        return this;
    }

    public PizzaBuilder addExtraCheese() {
        toppings.add(Topping.EXTRA_CHEESE);
        return this;
    }

    public PizzaBuilder addPeppers() {
        toppings.add(Topping.PEPPERS);
        return this;
    }

    public PizzaBuilder addChicken() {
        toppings.add(Topping.CHICKEN);
        return this;
    }

    public PizzaBuilder addOlives() {
        toppings.add(Topping.OLIVES);
        return this;
    }

    public PizzaBuilder addSpinach() {
        toppings.add(Topping.SPINACH);
        return this;
    }

    public PizzaBuilder addTomatoAndBasil() {
        toppings.add(Topping.TOMATO_AND_BASIL);
        return this;
    }

    public PizzaBuilder addBeef() {
        toppings.add(Topping.BEEF);
        return this;
    }

    public PizzaBuilder addHam() {
        toppings.add(Topping.HAM);
        return this;
    }

    public PizzaBuilder addPesto() {
        toppings.add(Topping.PESTO);
        return this;
    }

    public PizzaBuilder addSpicyPork() {
        toppings.add(Topping.SPICY_PORK);
        return this;
    }

    public PizzaBuilder addHamAndPineapple() {
        toppings.add(Topping.HAM_AND_PINEAPPLE);
        return this;
    }

    public Pizza build() {
        return new Pizza(chain, size, toppings);
    }
}
