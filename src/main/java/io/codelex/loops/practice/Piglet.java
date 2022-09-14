package io.codelex.loops.practice;

import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean readBoolean = true;
        int number;
        int count = 0;
        String answer;

        System.out.println("Welcome to Piglet!");
        while (readBoolean) {
            number = (int) (Math.random() * 10 + 1);
            count = count + number;
            System.out.println("You rolled a " + number);
            if (number == 1) {
                System.out.println("You got 0 points.");
                break;
            }
            System.out.println("Roll again? y/n");
            answer = in.nextLine();
            if (answer.equals("n")) {
                System.out.println("You got " + count + " points.");
                readBoolean = false;

            }
        }
    }
}

