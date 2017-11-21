package com.rastishka.javastart.lesson_3_home_work;
import	java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner	stdInScanner =	new	Scanner(System.in);
        System.out.println("Enter message:");
        String message = stdInScanner.nextLine();
        System.out.println("Enter name: ");
        String name = stdInScanner.next();
        System.out.println("Edited message: " + message.replaceAll("\\$\\{name\\}",name));
    }
}
