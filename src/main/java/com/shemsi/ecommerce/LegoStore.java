package com.shemsi.ecommerce;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class LegoStore {
    public static void main(String[] args) {
        HashMap<String, Double> inventory = new HashMap<>();
        ArrayList<String> shoppingCart = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);


        System.out.println("Welcome to the Lego Store!\n");
        System.out.println("Available toys:");

        inventory.put("Education Prime Set", 384.95);
        inventory.put("Christmas Tree", 44.99);
        inventory.put("Freight Train", 199.99);
        inventory.put("Stunt Arena", 159.99);
        inventory.put("Material Handler", 149.99);
        inventory.put("Castle Expansion Set", 129.99);


        for (String toy : inventory.keySet()) {
            System.out.println(toy + " $" + inventory.get(toy));
        }

        while (true) {
            System.out.println("\nEnter the name of the toy you'd like to purchase or type checkout to proceed to checkout:");
            String selectedToy = userInput.nextLine();
            if (inventory.containsKey(selectedToy)) {
                shoppingCart.add(selectedToy);
                System.out.println(selectedToy + " added to cart.");
            } else if (selectedToy.equalsIgnoreCase("checkout")) {
                break;
            } else {
                System.out.println("Sorry, that toy is not available.");
            }
        }
        userInput.close();

        double totalCost = 0;
        System.out.println("\nShopping cart:");
        for (String toy : shoppingCart) {
            double cost = inventory.get(toy);
            System.out.println(toy + " $" + cost);
            totalCost += cost;
        }

        System.out.println("\nTotal cost: $" + totalCost);
        System.out.println("\nThank you for shopping at the Lego Store!");
    }
}
