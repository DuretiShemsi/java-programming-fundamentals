package com.shemsi.game;

import java.util.Scanner;

public class RockPaperScissorsOneTry {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        //Introduce the game

        System.out.println("Welcome to Rock, Paper, Scissors!");

        //// Prompt the user to enter their move
        System.out.print("What is your move? To make a move, enter rock, paper, or scissors: ");
        String usersMove = userInput.nextLine();

        //verify that the move is valid

        if (!usersMove.equalsIgnoreCase("rock")
                && !usersMove.equalsIgnoreCase("paper")
                && !usersMove.equalsIgnoreCase("scissors")) {
            System.out.println("Your move is invalid!");
        } else {

            // generate random opponent move
            int randomNumber = (int) ((Math.random() * (4 - 1)) + 1);
            String opponentMove = "";
            if (randomNumber == 1) {
                System.out.println(opponentMove = "rock");
            } else if (randomNumber == 2) {
                System.out.println(opponentMove = "scissors");
            } else {
                System.out.println(opponentMove = "paper");
            }

            //check if the user move and opponent move are won, tie or loss

            if (usersMove.equals(opponentMove)) {
                System.out.println("It's a tie!");
            } else if ((usersMove.equals("rock") && opponentMove.equals("scissors")) ||
                    (usersMove.equals("paper") && opponentMove.equals("rock")) ||
                    (usersMove.equals("scissors") && opponentMove.equals("paper"))) {
                System.out.println("You won!");
            }
                else{
                    System.out.println("You lost!");
                }
            }
        }

        }









