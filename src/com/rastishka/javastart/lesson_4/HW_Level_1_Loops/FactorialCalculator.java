package com.rastishka.javastart.lesson_4.HW_Level_1_Loops;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 20) {
            long factorial = 1;
            for (int i = 1; i<=n; i++){
                factorial *= i;
            }
            System.out.println(factorial);
        } else {
            System.out.println("IllegalArgumentException");
        }
    }
}
