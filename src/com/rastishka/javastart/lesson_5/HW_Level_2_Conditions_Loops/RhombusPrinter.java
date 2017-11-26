package com.rastishka.javastart.lesson_5.HW_Level_2_Conditions_Loops;

public class RhombusPrinter {
    public static void main(String[] args) {
        printRhombus(11);
    }

    public static void printRhombus(int size) {
        int med = size / 2 + 1;

        int c1; // First star int a row
        int c2; // Second star in a row
        int pointer = 0; // Distance from the center of rhombus


        for (int row = 1; row <= size; row++) {
            c1 = med + pointer;
            c2 = med - pointer;

            for (int i = 1; i <= size; i++) {

                if (i == c1 || i == c2) {
                    System.out.print("*");
                } else {
                    System.out.print(".");
                }
            }
            if (row > med - 1) {
                pointer -= 1;
            } else {
                pointer += 1;
            }
            System.out.println();
        }
    }
}

