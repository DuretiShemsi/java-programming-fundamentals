package com.shemsi.calculator;

import java.util.Scanner;

public class SubtractTwoNumbers {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;

        System.out.println("Hello, This is my simple calculator that adds two number");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.print("Please provide the second number: ");
        numberTwo = userInput.nextInt();

        int subtract = numberOne - numberTwo;
        System.out.println("The subtraction of " + numberOne + " and " + numberTwo  + " is " + subtract);
    }

}