package Lesson_3_Home_work;
import	java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner	stdInScanner =	new	Scanner(System.in);
        System.out.println("Enter x: ");
        double x = stdInScanner.nextDouble();
        double f = Math.log(Math.sin(x) + Math.exp(x)*Math.sqrt(x)/Math.PI);
        System.out.println(f);

    }
}
