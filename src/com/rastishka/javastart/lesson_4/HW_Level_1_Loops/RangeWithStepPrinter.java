package com.rastishka.javastart.lesson_4.HW_Level_1_Loops;

import java.util.Scanner;

public class RangeWithStepPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = scanner.nextInt();
        System.out.println("Enter last: ");
        int last = scanner.nextInt();
        System.out.println("Enter step: ");
        int step = scanner.nextInt();


        if (first < last && step < 0) {
            System.out.print("IllegalArgumentException");
        } else if (first < last && step > 0) {
            for (int i = first; i <= last; i += step) {
                System.out.print(i);
            }
        } else if (first > last && step < 0) {
            for (int n = first; n >= last; n += step) {
                System.out.print(n);
            }
        } else if (first > last && step > 0) {
            for (int n = first; n >= last; n -= step) {
                System.out.print(n);
            }
        } else if (first == last) {
            System.out.print(first);
        } else {
            System.out.print("IllegalArgumentException");
        }
    }
}