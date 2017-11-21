package com.rastishka.javastart.lesson_4.HW_Level_1_Conditions;

import java.util.Scanner;

public class IsAgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        if (age <=120 && age >=1) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}
