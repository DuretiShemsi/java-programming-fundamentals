package com.shemsi.conditional;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Prompt the user to enter the score of their paper
        System.out.print("Enter the score on your English paper: ");
        double score = userInput.nextDouble();

        if (score >80) {
            System.out.println("Your Grade is A");
        }
        else if (score <= 80 && score > 60) {

            System.out.println("Your Grade is B");
        }
        else if (score <= 60 && score > 50) {

            System.out.println("Your Grade is C");
        }
        else if (score <= 50 && score > 45) {

            System.out.println("Your Grade is D");
        }
        else if (score <= 45 && score > 25) {

            System.out.println("Your Grade is E");
        }

        else if (score < 25) {

            System.out.println("Your Grade is F");
        }

    }

}
