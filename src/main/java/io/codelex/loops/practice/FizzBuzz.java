package io.codelex.loops.practice;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write number");
        int number = in.nextInt();
        boolean multiple;

        for (int i = 1; i <= number; i++) {
            multiple = false;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                multiple = true;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                multiple = true;
            }
            if (multiple) {
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}