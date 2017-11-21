package com.rastishka.javastart.lesson_2_home_work;

public class AverageCalculator {
    public static void main(String[] args) {
        int a = 1; // Input: any positive number
        int b = 1; // Input: any positive number

        int avg = (a/2+b/2 + (a%2 + b%2)/2); // Your formula

        System.out.println("avg = " + avg);
    }
}
