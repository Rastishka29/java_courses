package com.rastishka.javastart.lesson_4.HW_Level_1_Conditions;

import java.util.Scanner;

public class ToyNameToIdConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter toy name: ");
        String name = scanner.next();

        switch (name){
            case "Car": System.out.println(0); break;
            case "Lego": System.out.println(1); break;
            case "Doll": System.out.println(2); break;
            case "Puzzle": System.out.println(3); break;
            default: System.out.println("IllegalArgumentException"); break;
        }
    }

}
