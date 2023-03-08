package com.shemsi.loops;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: $");
        double balance = scanner.nextDouble();

        do {
            System.out.println("Welcome to the ATM");
            System.out.println("Please select an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter withdrawal amount: $");
                double withdrawalAmount = scanner.nextDouble();
                if (withdrawalAmount > balance) {
                    System.out.println("Insufficient balance. Please enter a lower amount.");
                } else {
                    balance -= withdrawalAmount;
                    System.out.println("Withdrawal of $" + withdrawalAmount + " successful.");
                }
            } else if (choice == 2) {
                System.out.print("Enter deposit amount: $");
                double depositAmount = scanner.nextDouble();
                balance += depositAmount;
                System.out.println("Deposit of $" + depositAmount + " successful.");
            } else if (choice == 3) {
                System.out.println("Current balance: $" + balance);
            } else if (choice == 4) {
                System.out.println("Thank you for using the ATM.");
                break; // exit loop
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (true);

        scanner.close();

    }

}
