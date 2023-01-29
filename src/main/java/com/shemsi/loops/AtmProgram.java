package com.shemsi.loops;

import java.util.Scanner;

public class AtmProgram {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        boolean isRunning = true;


            System.out.println("Welcome to the ATM. Please choose an option:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");

            int userChoice = userInput.nextInt();




    }
}