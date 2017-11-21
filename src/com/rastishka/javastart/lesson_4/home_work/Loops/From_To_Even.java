package com.rastishka.javastart.lesson_4.home_work.Loops;

import java.util.Scanner;

public class From_To_Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value from: ");
        int from = scanner.nextInt();
        System.out.println("Enter value to: ");
        int to = scanner.nextInt();

        if (from <= to) {
            if (from % 2 != 0) {
                for (int i = from + 1; i <= to; i += 2) {
                    System.out.println(i);
                }
            } else {
                for (int n = from; n <= to; n += 2) {
                    System.out.println(n);
                }
            }
        } else {
            System.out.println("from is bigger than to");
        }
    }
}
