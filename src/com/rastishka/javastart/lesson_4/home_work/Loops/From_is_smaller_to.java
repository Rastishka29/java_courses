package com.rastishka.javastart.lesson_4.home_work.Loops;

import java.util.Scanner;

public class From_is_smaller_to {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value from: ");
        int from = scanner.nextInt();
        System.out.println("Enter value to: ");
        int to = scanner.nextInt();

        for (int i=from; i<=to; i++) {
            System.out.println(i);
        }
    }
}
