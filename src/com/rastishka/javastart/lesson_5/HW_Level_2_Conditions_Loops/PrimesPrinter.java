package com.rastishka.javastart.lesson_5.HW_Level_2_Conditions_Loops;

public class PrimesPrinter {
    public static void main(String[] args) {
        printPrimes(-1, 11);
    }

    public static void printPrimes(int from, int to) {
        // This method prints prime digits
        boolean isPrime= true;

        if (to <= from){
            throw new IllegalArgumentException("To has to be bigger then from");
        }
        for (int i = from; i <= to; i++){
            isPrime= true;
            if (i <= 1){
                continue;
            }
            for (int n = 2; n <= to/2; n++){
                if (i == n){
                    continue;
                }
                if (i % n == 0 ){
                    isPrime = false;
                    continue;
                }
            }
            if (isPrime == true){
                System.out.print(i+" ");
            }
        }
    }
}
