package com.rastishka.javastart.lesson_7.lection;

public class TrianglePrinter {
    public static void main(String[] args) {
        printTriangle(5);
        printTriangle(3);
    }

    public static void printTriangle(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size can't be less then 0");
        }
        for (int starsLine = 1; starsLine <= size; starsLine++) {
            LinePrinter.printLine(starsLine);
        }
    }
}

