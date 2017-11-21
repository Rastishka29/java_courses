package com.rastishka.javastart.lesson_3_home_work;
import	java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner	stdInScanner =	new	Scanner(System.in);
        System.out.println("Enter X in Bin: ");
        int x = Integer.parseInt(stdInScanner.next(),2);
        System.out.println("Enter Y in Oct:");
        int y = Integer.parseInt(stdInScanner.next(),8);
        System.out.println("Enter Z in Hex:");
        int z = Integer.parseInt(stdInScanner.next(),16);

        int sum = x + y +z;

        System.out.println("X + Y + Z =" + sum);
    }
}
