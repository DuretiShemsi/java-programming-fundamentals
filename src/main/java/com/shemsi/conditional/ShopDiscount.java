package com.shemsi.conditional;

import java.util.Scanner;

public class ShopDiscount {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Prompt the user to enter the quantity of units they want to purchase
        System.out.print("Enter the quantity of units: ");
        int quantity = userInput.nextInt();

        // Calculate the total cost of the units
        double unitPrice = 100;
        double totalCost = quantity * unitPrice;

        // Check if the total cost exceeds 1000
        if (totalCost > 1000) {
            // Calculate the discount
            double discount = totalCost * 0.1;

            // Calculate the total cost after the discount
            totalCost -= discount;

            System.out.println(totalCost);
        }
else{
            System.out.println(totalCost);
        }
    }
}
