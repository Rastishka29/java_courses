package com.rastishka.javastart.lesson_5.HW_Level_2_Conditions_Loops;

import java.util.Arrays;

public class DigitsPrinter {
    public static void main(String[] args) {
        int number = 147292;
        int[] digArray = new int[6];
        printDigits(number, digArray);
    }

    public static void printDigits(int number, int[] digArray) {
        int digit;

        // Define if number is less then 0

        if (number < 0) {
            number *= -1;
            System.out.print("- ");
        }

        // Filling the array with reversed digits of number

        for (int i = digArray.length - 1; i >= 0; i--) {
            digit = number % 10;
            number = number / 10;
            digArray[i] = digit;
        }

        // Printing the elements of the array one by one

        for (int x = 0; x < digArray.length; x++) {
            System.out.print(String.valueOf(digArray[x]+" "));
        }
    }
}