package com.rastishka.javastart.lesson_2_home_work;

public class DigitsPrinter {
    public static void main(String[] args) {
        int n = 987654321;  // Input: any positive number

        int lastNumber1 = n/10000%10;
        int lastNumber2 = n/1000%10;
        int lastNumber3 = n/100%10;
        int lastNumber4 = n/10%10;
        int lastNumber5 = n%10;

        System.out.println(lastNumber1);
        System.out.println(lastNumber2);
        System.out.println(lastNumber3);
        System.out.println(lastNumber4);
        System.out.println(lastNumber5);
    }
}
