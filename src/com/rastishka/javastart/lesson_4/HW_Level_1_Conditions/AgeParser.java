package com.rastishka.javastart.lesson_4.HW_Level_1_Conditions;

import java.util.Scanner;

public class AgeParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
        String ageString = scanner.next();
        int age = Integer.parseInt(ageString);

        if (age <=120 && age >=1) {
            System.out.println(age);
        }else {
            System.out.println("IllegalArgumentException");
        }
    }
}
