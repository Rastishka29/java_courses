package com.rastishka.javastart.lesson_5_lection;

import java.util.Scanner;

public class Cakes2 {
    public static void main(String[] args) {
        Scanner stdInScanner = new Scanner(System.in);
        System.out.print("IN: cakes= ");
        int cakes = stdInScanner.nextInt();
        System.out.println("I have " + cakes + " cakes.");

        for (int cakeIndex = cakes - 1; cakeIndex >= 0; cakeIndex--) {
            System.out.println("I have eaten a cake. " + cakeIndex + " are left.");
        }
    }
}
