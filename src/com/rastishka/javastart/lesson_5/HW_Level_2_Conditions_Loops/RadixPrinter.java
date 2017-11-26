package com.rastishka.javastart.lesson_5.HW_Level_2_Conditions_Loops;

public class RadixPrinter {
    public static void main(String[] args) {
        printInRadix(147292, 2);
        printInRadix(147292, 8);
        printInRadix(147292, 10);
        printInRadix(-147292, 2);
        printInRadix(147292, -10);
    }

    public static void printInRadix(int number, int radix) {
        // This method transforms number into defined radix notation
        if (number < 0 || radix < 0 || radix > 10) {
            throw new IllegalArgumentException("Enter positive number and radix");
        }
        System.out.println(Integer.toString(number, radix));
    }
}
