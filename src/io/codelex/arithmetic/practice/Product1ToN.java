package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Product1ToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write number");
        int num = in.nextInt();
        int factor = 1;
        for (int i = 1; i <= num; i++) {
            factor = factor * i;
        }
        System.out.println("Factorial of " + num + " is: " + factor);
    }
}
