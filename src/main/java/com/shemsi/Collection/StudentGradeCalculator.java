package com.shemsi.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // create a list
        ArrayList<Double> gradesList = new ArrayList<>();
        System.out.println("How many grades do you want to enter? ");
        int numberOfGrades = userInput.nextInt();

        for (int i = 0; i < numberOfGrades; i++) {
            System.out.println("Enter your grade, one at a time: ");
            double grade = userInput.nextDouble();
            gradesList.add(grade);
        }
        double finalGrade= 0;
        for(double grades: gradesList) {
            finalGrade += grades;
        }
        finalGrade = finalGrade / gradesList.size();
        System.out.println("Your final grade is: "+ finalGrade);
    }
}