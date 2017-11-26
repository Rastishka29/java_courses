package com.rastishka.javastart.lesson_5.HW_Level_2_Conditions_Loops;

public class DigitsSumCalculator {
    public static void main(String[] args) {
        int from = 147292;
        int to = 147292;

        digitsSum(from, to);
    }

    public static void digitsSum(int from, int to) {
        int number;
        int sum1;
        int digit;
        int sum2 = 0;
        if (from > to){
            throw new IllegalArgumentException("From can't be greater than to");
        }

        // This loop iterates numbers between from to to
        for (int i = from; i <= to; i++) {
            number = Math.abs(i);
            sum1 = 0;
            for (int n = 1; n <= Integer.valueOf(i).toString().length(); n++) {
                digit = number % 10;
                number = number / 10;
                sum1 += digit;
            }
            sum2 += sum1;
        }
        System.out.println(sum2);
    }
}
