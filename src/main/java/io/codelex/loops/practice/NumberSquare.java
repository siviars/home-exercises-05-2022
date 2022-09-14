package io.codelex.loops.practice;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Min?");
        int min = in.nextInt();
        System.out.println("Max?");
        int max = in.nextInt();
        int min2 = min;
        int repeat = max - min + 1;

        for (int i = 1; i <= repeat; i++) {
            for (int j = 1; j <= repeat; j++) {
                System.out.print(min2);
                min2 = min2 + 1;
                if (min2 > repeat) {
                    min2 = min;
                }
            }
            min2 = min + i;
            System.out.println("");
        }
    }

}
