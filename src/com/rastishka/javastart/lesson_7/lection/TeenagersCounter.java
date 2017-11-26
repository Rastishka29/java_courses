package com.rastishka.javastart.lesson_7.lection;

public class TeenagersCounter {
    public static void main(String[] args) {
        int[] ages = {30, 15, 12, 40, 10, 15};
        countTeenagers(ages);
    }

    public static void countTeenagers(int[] ages) {
        int count = 0;
        for (int elem : ages) {
            if (elem >=12 && elem <=18){
                count ++;
                System.out.println(count);
            }

        }
    }
}
