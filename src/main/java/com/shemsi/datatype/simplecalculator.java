package com.shemsi.datatype;

import java.util.Scanner;

public class simplecalculator {
    public static void main(String[] args) {

        int numberOne;
        int numberTwo;

        System.out.println("Hello, This is my simple calculator");
        Scanner userInput = new Scanner(System.in);
        // Prompt the user to enter two integers
        System.out.print("Enter the first integer: ");
        numberOne = userInput.nextInt();
        System.out.print("Enter the second integer: ");
        numberTwo = userInput.nextInt();

        // Calculate the sum, difference, and product of the two integers
        int sum = numberOne + numberTwo;
        int difference = numberOne - numberTwo;
        int product = numberOne * numberTwo;

        // Calculate the average of the two integers
        double average = (double) sum / 2;

        // Calculate the distance between the two integers
        int distance = Math.abs(numberOne - numberTwo);

        // Calculate the maximum and minimum of the two integers
        int maximum = Math.max(numberOne, numberTwo);
        int minimum = Math.min(numberOne, numberTwo);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Average: " + average);
        System.out.println("Distance: " + distance);
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
