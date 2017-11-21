package com.rastishka.javastart.lesson_4.home_work.Loops;

import java.util.Scanner;

public class From_To_Any {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value from: ");
        int from = scanner.nextInt();
        System.out.println("Enter value to: ");
        int to = scanner.nextInt();

        if (from > to) {
            for (int i=to; i<=from; i++) {
                System.out.println(i);
            }
        } else if (from < to) {
            for (int n=from; n<=to; n++) {
                System.out.println(n);
            }
        } else if (from == to){
            System.out.println(from);
        }

    }
}
