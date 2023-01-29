package com.shemsi.array;

import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        int[] studentOneGrades = {78, 89, 78, 80};
        int[] studentTwoGrades = {78, 67, 68, 92};
        int[] studentThreeGrades = {88, 92, 92, 94};

        String[] students = {"Student One", "Student Two", "Student Three"};
        int[] grades = null;

        //prompt user

        Scanner userInput = new Scanner(System.in);
        System.out.println("Student Names: " + Arrays.toString(students));
        System.out.print("Enter a student's name:");

        String selectedStudentName = userInput.nextLine();


        int studentIndex = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(selectedStudentName)) {
                studentIndex = i;
                break;
            }

            if (selectedStudentName == "Student One")
                System.out.println(Arrays.toString(studentOneGrades));

        }
    }
}