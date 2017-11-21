package com.rastishka.javastart.lesson_4.HW_Level_1_Loops;

import java.util.Scanner;

public class FilledMatrixPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.println("Enter cols: ");
        int cols = scanner.nextInt();
        System.out.println("Enter filler: ");
        int filler = scanner.nextInt();

        if (rows < 0 || cols < 0){
            System.out.println("IllegalArgumentException");
        } else {
            for (int numRows = 1; numRows <= rows; numRows++) {
                for (int numCols = 1; numCols < cols; numCols++) {
                    System.out.print(filler + "\t");
                }
                System.out.print(filler + "\n");
            }
        }
    }
}


