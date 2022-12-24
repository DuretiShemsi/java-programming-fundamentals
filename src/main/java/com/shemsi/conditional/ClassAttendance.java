package com.shemsi.conditional;

import java.util.Scanner;

public class ClassAttendance {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Prompt the user to enter the number of classes held and the number of classes attended
        System.out.print("Enter the number of classes held: ");
        int classesHeld = userInput.nextInt();
        System.out.print("Enter the number of classes attended: ");
        int classesAttended = userInput.nextInt();

        // Calculate the attendance percentage
        double attendancePercentage = (double) classesAttended / classesHeld * 100;

        // Check if the attendance percentage is greater than or equal to 75%
        if (attendancePercentage >= 75) {
            System.out.println(attendancePercentage + "%" + " You are allowed to sit in on the exam.");
        } else {
            System.out.println(attendancePercentage + "%" + " You are not allowed to sit in on the exam.");
        }
    }
}
