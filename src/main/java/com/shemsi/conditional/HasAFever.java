package com.shemsi.conditional;

import java.util.Scanner;

public class HasAFever {
    public static void main(String[] args) {
        double temp;
        Scanner userInput = new Scanner(System.in);
        // Prompt the user to enter numbers
        System.out.print("Enter the temperature: ");
        temp = userInput.nextDouble();

        if (temp >100)
        {
            System.out.println("You have a fever");
        }

        else {
                System.out.println("You don't have a fever");
            }
        }
    }

