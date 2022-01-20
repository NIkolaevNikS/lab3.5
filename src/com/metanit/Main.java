package com.metanit;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = a.nextInt();

        if (num>=0&& num<=50) {
            System.out.println("F");
        }
        else if (num>=51&&num<=70) {
            System.out.println("D");
        }
        else if (num>=71&&num<=80) {
            System.out.println("C");
        }
        else if (num>=81&&num<=90) {
            System.out.println("B");
        }
        else if (num>=91&&num<=100) {
            System.out.println("A");
        }
    }
}