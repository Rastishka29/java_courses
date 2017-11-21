package com.rastishka.javastart.lesson_4.HW_Level_1_Loops;

import java.util.Scanner;

public class EvensRangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = scanner.nextInt();
        System.out.println("Enter last: ");
        int last = scanner.nextInt();

        if (first < last) {
            if (first % 2 != 0) {
                for (int i = first + 1; i <= last; i += 2) {
                    System.out.println(i);
                }
            } else {
                for (int n = first; n <= last; n += 2) {
                    System.out.println(n);
                }
            }
        } else if (first > last) {
            System.out.println("");
        }
    }
}
