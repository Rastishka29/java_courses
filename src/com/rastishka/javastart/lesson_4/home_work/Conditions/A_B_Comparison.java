package com.rastishka.javastart.lesson_4.home_work.Conditions;

import java.util.Scanner;

public class A_B_Comparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();

        if (a < b) {
            System.out.println("-1");
        } else if (a == b) {
            System.out.println("0");
        } else if (a > b) {
            System.out.println("+1");
        }
    }
}
