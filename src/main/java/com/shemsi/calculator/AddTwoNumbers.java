package com.shemsi.calculator;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;

        System.out.println("Hello, This is my simple calculator that adds two number");
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please provide the first number: ");
        numberOne = userInput.nextInt();

        System.out.print("Please provide the second number: ");
        numberTwo = userInput.nextInt();

        int sum = numberOne + numberTwo;
        System.out.println("The sum of " + numberOne + " and " + numberTwo  + " is " + sum);
    }

}