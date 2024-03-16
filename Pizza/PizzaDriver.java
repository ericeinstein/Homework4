package Pizza;

public class PizzaDriver {
        public static void main(String[] args) {
                // Creating Pizza Hut pizzas (part 1)
                Pizza hutSmallPizza = new PizzaBuilder("Pizza Hut", "Small")
                                .addPepperoni()
                                .addMushrooms()
                                .addExtraCheese()
                                .build();
                Pizza hutMediumPizza = new PizzaBuilder("Pizza Hut", "Medium")
                                .addSausage()
                                .addOnions()
                                .addPeppers()
                                .addChicken()
                                .addOlives()
                                .addSpicyPork()
                                .build();
                Pizza hutLargePizza = new PizzaBuilder("Pizza Hut", "Large")
                                .addBacon()
                                .addTomatoAndBasil()
                                .addHamAndPineapple()
                                .addPesto()
                                .addSpinach()
                                .addBeef()
                                .addHam()
                                .build();
                // Eating Pizza Hut pizzas (part 1)
                hutSmallPizza.eat();
                hutMediumPizza.eat();
                hutLargePizza.eat();

                // Creating Pizza Hut pizzas (part 2)
                Pizza hutSmallPizza2 = new PizzaBuilder("Pizza Hut", "Small")
                                .addPepperoni()
                                .addExtraCheese()
                                .build();

                Pizza hutLargePizza2 = new PizzaBuilder("Pizza Hut", "Large")
                                .addHamAndPineapple()
                                .addPesto()
                                .addSpicyPork()
                                .build();

                // Eating Pizza Hut pizzas (part 2)
                hutSmallPizza2.eat();
                hutLargePizza2.eat();

                // Creating pizzas for Little Caesars
                Pizza caesarsSmallPizza = new PizzaBuilder("Little Caesars", "Small")
                                .addPepperoni()
                                .addExtraCheese()
                                .addChicken()
                                .addOlives()
                                .addSpicyPork()
                                .addHam()
                                .build();
                Pizza caesarsMediumPizza = new PizzaBuilder("Little Caesars", "Medium")
                                .addTomatoAndBasil()
                                .addHamAndPineapple()
                                .addPesto()
                                .addSpinach()
                                .addBeef()
                                .addPepperoni()
                                .addMushrooms()
                                .addExtraCheese()
                                .build();

                // Eating Little Caesars pizzas
                caesarsSmallPizza.eat();
                caesarsMediumPizza.eat();

                // Creating pizzas for Dominos
                Pizza dominosSmallPizza = new PizzaBuilder("Dominos", "Small")
                                .addHam()
                                .build();
                Pizza dominosLargePizza = new PizzaBuilder("Dominos", "Large")
                                .addSpicyPork()
                                .addMushrooms()
                                .addOlives()
                                .build();

                // Eating Dominos pizzas
                dominosSmallPizza.eat();
                dominosLargePizza.eat();
        }
}