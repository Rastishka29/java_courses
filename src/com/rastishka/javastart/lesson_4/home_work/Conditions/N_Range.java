package com.rastishka.javastart.lesson_4.home_work.Conditions;

import java.util.Scanner;

public class N_Range {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();

        if (n >= 100 && n <=200 ) {
            System.out.println("n is in a range between 100 and 200");
        } else {
            System.out.println("n is NOT in a range between 100 and 200");
        }
    }
}
