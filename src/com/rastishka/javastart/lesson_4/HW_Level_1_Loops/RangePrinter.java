package com.rastishka.javastart.lesson_4.HW_Level_1_Loops;

import java.util.Scanner;

public class RangePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = scanner.nextInt();
        System.out.println("Enter last: ");
        int last = scanner.nextInt();

        if (first < last) {
            for (int i = first; i <= last; i++) {
                System.out.print(i);
            }
        } else if (first > last) {
            for (int n = first; n >= last; n--) {
                System.out.print(n);
            }
        } else if (first == last) {
            System.out.print(first);
        }
    }
}

