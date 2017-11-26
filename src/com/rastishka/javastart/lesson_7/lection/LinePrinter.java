package com.rastishka.javastart.lesson_7.lection;

public class LinePrinter {
    public static void main(String[] args) {

        printLine(3);
        printLine(4);
    }

    public static void printLine(int starsQty) {
        if (starsQty < 0) {
            throw new IllegalArgumentException("Stars quantity can't be less then 0");
        }

        for (int starsPrint = 1; starsPrint <= starsQty; starsPrint++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
