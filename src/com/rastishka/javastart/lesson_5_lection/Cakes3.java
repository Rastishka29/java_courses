package com.rastishka.javastart.lesson_5_lection;

import java.util.Scanner;

public class Cakes3 {
    public static void main(String[] args) {
        Scanner stdInScanner = new Scanner(System.in);
        System.out.print("IN: cakes= ");
        int cakes = stdInScanner.nextInt();
        System.out.println("I have " + cakes + " cakes.");

        for (int cakeIndex = 1; cakeIndex <= cakes; cakeIndex++) {
            System.out.println("I have eaten " + cakeIndex + " cake.");
            if (cakeIndex % 2 == 0) {
                System.out.println("Wonderful world.");
            }
        }
    }
}