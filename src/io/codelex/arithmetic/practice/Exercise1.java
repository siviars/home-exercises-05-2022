package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write first number");
        int number1 = in.nextInt();
        System.out.println("Write second number");
        int number2 = in.nextInt();
        if (number1 == 15 || number2 == 15 || number1 - number2 == 15 || number1 + number2 == 15) {
            System.out.println("True");
        }
    }
}
