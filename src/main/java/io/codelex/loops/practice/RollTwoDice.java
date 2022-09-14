package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        int sum1, sum2, number1, number2;
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Desired sum:");
        sum1 = in.nextInt();
        do {
            number1 = rand.nextInt(5) + 1;
            number2 = rand.nextInt(5) + 1;
            sum2=number1+number2;
            System.out.println(number1 + " and " + number2 + " = " + sum2);
        } while (sum1!=sum2);
    }
}
