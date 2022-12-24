package com.shemsi.conditional;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        int num;
        Scanner userInput = new Scanner(System.in);
        // Prompt the user to enter numbers
        System.out.print("Enter the number: ");
        num = userInput.nextInt();

        if (num>=0)
        {
            System.out.println(num + " is positive");
        }

        else {
                System.out.println(num + " is negative");
            }
        }
    }


