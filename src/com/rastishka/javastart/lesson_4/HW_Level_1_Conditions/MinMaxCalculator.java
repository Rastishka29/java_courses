package com.rastishka.javastart.lesson_4.HW_Level_1_Conditions;

import java.util.Scanner;

public class MinMaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("max = " + a + " min = " + b);
        } else if (a < b){
            System.out.println("max = " + b + " min = " + a);
        } else {
            System.out.println("a=b");
        }
    }
}
