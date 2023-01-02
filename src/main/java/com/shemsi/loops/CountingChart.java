package com.shemsi.loops;

public class CountingChart {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            String word = "";
            if (i == 1) {
                word = "One";
            } else if (i == 2) {
                word = "Two";
            } else if (i == 3) {
                word = "Three";
            } else if (i == 4) {
                word = "Four";
            } else if (i == 5) {
                word = "Five";
            } else if (i == 6) {
                word = "Six";
            } else if (i == 7) {
                word = "Seven";
            } else if (i == 8) {
                word = "Eight";
            } else if (i == 9) {
                word = "Nine";
            } else if (i == 10) {
                word = "Ten";
            }
            System.out.println(i + " - " + word);
        }
    }
}
