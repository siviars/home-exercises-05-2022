package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exersise6 {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Write number (0 - exit)");
            int number = in.nextInt();
            if (number == 0) {
                break;
            }
            count = count + number;
            System.out.println("Number sum is " + count);
            System.out.println("-------------------");

        }
    }
}
