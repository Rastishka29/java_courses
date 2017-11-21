package com.rastishka.javastart.lesson_4.HW_Level_1_Conditions;

import java.util.Scanner;

public class IdToToyNameConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter toy ID: ");
        int id = scanner.nextInt();

        if (id == 0){
            System.out.println("Car");
        } else if (id == 1){
            System.out.println("Lego");
        } else if (id == 2){
            System.out.println("Doll");
        } else if (id == 3){
            System.out.println("Puzzle");
        } else {
            System.out.println("IllegalArgumentException");
        }
    }
}
