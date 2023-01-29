package com.shemsi.Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class HighScore {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // create a list to store the scores
        ArrayList<Double> scoresList = new ArrayList<>();
        // prompt the user for the number of scores they want to enter
        System.out.println("How many scores do you want to enter? ");
        double numberOfScores = userInput.nextInt();

        // prompt the user for each score and add it to the list
        for (int i = 0; i < numberOfScores; i++) {
            System.out.println("Enter your score, one at a time: ");
            double score = userInput.nextDouble();
            scoresList.add(score);
        }

        // determine the highest score from the list
        Double highestScore = scoresList.get(0);
        for (Double score : scoresList) {
            if (score > highestScore) {
                highestScore = score;
            }
        }

        // print the highest score to the user
        System.out.println("The highest score is: " + highestScore);
    }
}
