package com.rastishka.javastart.lesson_5_lection;

import java.util.Scanner;

public class Cakes5 {
    public static void main(String[] args) {
        Scanner stdInScanner = new Scanner(System.in);
        System.out.print("IN: people= ");
        int people = stdInScanner.nextInt();
        System.out.print("cakes= ");
        int cakes = stdInScanner.nextInt();

        for (int personIndex = 1; personIndex <= people; personIndex++) {
            System.out.println("I'm " + personIndex + " person.");
            System.out.println("I have " + cakes + " cakes.");
            for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
                System.out.println("I have eaten " + cakeIndex + " cake.");
            }
        }
    }
}
