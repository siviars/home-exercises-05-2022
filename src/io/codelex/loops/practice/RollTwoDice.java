package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        int sum1, sum2, number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.println("Desired sum:");
        sum1 = in.nextInt();
        do {
            number1 = rollDice();
            number2 = rollDice();
            sum2 = number1 + number2;
            System.out.println(number1 + " and " + number2 + " = " + sum2);
        } while (sum1 != sum2);
    }

    private static int rollDice() {
        Random rand = new Random();
        return rand.nextInt(5) + 1;
    }

}
