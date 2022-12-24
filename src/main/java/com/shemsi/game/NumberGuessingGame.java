package com.shemsi.game;

import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Tell the user the objective of the game
        System.out.println("Welcome to the number guessing game");
        System.out.println("A number is chosen between 1 to 100. Guess the number within 1 trial.");
        System.out.println("Do you want to play the number guessing game");

        String playAgain = userInput.nextLine();


        while (playAgain.equalsIgnoreCase( "yes")) {

            // Generate a random number between 1 and 100
            int randomNumber = (int)(Math.random() * 100) + 1;


            // Prompt the user to enter the number to guess
            System.out.println("Guess a number between 1 and 100: ");
            int numberGuessed = userInput.nextInt();
            System.out.println(randomNumber);
            if (numberGuessed > randomNumber) {
                System.out.println("Too high");
            } else if (numberGuessed < randomNumber) {
                System.out.println("Too low");
            } else if (numberGuessed ==randomNumber)

            {
                System.out.println("Congratulations! You guessed the number.");
            }

            // Prompt the user to play again
            System.out.println("Do you want to play again? (yes/no) ");
            String response = userInput.next();
            }
        }
    }


