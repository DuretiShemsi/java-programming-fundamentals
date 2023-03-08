package com.shemsi.datastructure;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LegoStore {

        public static void main(String[] args) {
            // Store the products available in the store
            Map<String, String> products = new HashMap<>();
            products.put("EDU", "Education Prime Set");
            products.put("CHRI", "Christmas Tree");
            products.put("FREI", "Freight Train");
            products.put("STUN", "Stunt Arena");
            products.put("HAND", "Material Handler");
            products.put("CAST", "Castle Expansion Set");

            // Store product prices
            Map<String, Double> prices = new HashMap<>();
            prices.put("EDU", 384.95);
            prices.put("CHRI", 44.99);
            prices.put("FREI", 199.99);
            prices.put("STUN", 159.99);
            prices.put("HAND", 149.99);
            prices.put("CAST", 129.99);

            // Store the inventory
            Map<String, Integer> inventory = new HashMap<>();
            inventory.put("EDU", 10);
            inventory.put("CHRI", 7);
            inventory.put("FREI", 6);
            inventory.put("STUN", 3);
            inventory.put("HAND", 2);
            inventory.put("CAST", 7);

            Scanner scanner = new Scanner(System.in);
            Map<String, Integer> shoppingCart = new HashMap<>();

            while (true) {
                System.out.println("Available products:");
                for (String code : products.keySet()) {
                    System.out.printf("%s - %s (%d available) - $%.2f\n", code, products.get(code), inventory.get(code), prices.get(code));
                }

                System.out.println("Enter product code to add to cart, or 'checkout' to finish shopping:");
                String code = scanner.nextLine().trim().toUpperCase();
                if (code.equals("CHECKOUT")) {
                    break;
                }

                if (!products.containsKey(code)) {
                    System.out.println("Invalid product code. Please try again.");
                    continue;
                }

                if (inventory.get(code) == 0) {
                    System.out.println("This product is out of stock. Please try again.");
                    continue;
                }

                shoppingCart.put(code, shoppingCart.getOrDefault(code, 0) + 1);
                inventory.put(code, inventory.get(code) - 1);

                System.out.println("Shopping cart:");
                for (String productCode : shoppingCart.keySet()) {
                    System.out.printf("%s - %s (%d in cart)\n", productCode, products.get(productCode), shoppingCart.get(productCode));
                }
            }

            System.out.println("Shopping cart:");
            double totalBill = 0;
            for (String productCode : shoppingCart.keySet()) {
                double productPrice = prices.get(productCode);
                int quantity = shoppingCart.get(productCode);
                double subtotal = productPrice * quantity;
                System.out.printf("%s - %s x %d - $%.2f\n", productCode, products.get(productCode), quantity, subtotal);
                totalBill += subtotal;
            }

            System.out.printf("Final bill: $%.2f\n", totalBill);
        }

    }


