package Pizza;

import java.util.List;

public class Pizza {
    private String chain;
    private String size;
    private List<Topping> toppings;

    public Pizza(String chain, String size, List<Topping> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = toppings;
    }

    public void eat() {
        System.out.println("Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping);
        }
        System.out.print("\n");
    }
}
