package com.rastishka.javastart.lesson_4.lection;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        int money = scanner.nextInt();
        int iphone = 999;

        if (money >= iphone) {
            System.out.println("Buy");
            money -= iphone;
        } else {
            System.out.println("Not buy");
        }

        System.out.println("Money left:" + money);
    }
}
