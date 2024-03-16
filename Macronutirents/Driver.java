package Macronutirents;

public class Driver {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("Customer1", "No Restriction"),
                new Customer("Customer2", "Paleo"),
                new Customer("Customer3", "Vegan"),
                new Customer("Customer4", "Nut Allergy"),
                new Customer("Customer5", "No Restriction"),
                new Customer("Customer6", "Vegan")
        };

        for (Customer customer : customers) {
            customer.requestMeal();
        }
    }
}
