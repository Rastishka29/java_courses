package com.rastishka.javastart.lesson_4.home_work.Conditions;

import java.util.Scanner;

public class A_B_C_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Enter c: ");
        int c = scanner.nextInt();

        if (a > b) {
            if (b > c) {
                System.out.println("c is the Min");
            } else {
                System.out.println("B is the Min");
            }
        } else {
            if (a > c) {
                System.out.println("c is the Min");
            } else {
                System.out.println("a is the Min");
            }
        }
    }
}
