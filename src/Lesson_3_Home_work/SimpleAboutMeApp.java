package Lesson_3_Home_work;
import	java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner	stdInScanner =	new	Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = stdInScanner.next();
        System.out.println("Enter your surname: ");
        String surname = stdInScanner.next();
        System.out.println("Enter your age: ");
        int age = stdInScanner.nextInt();

        System.out.println("I'm " + name + " " + surname + ", " + age + " years old");

    }
}
