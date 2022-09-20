package io.codelex.arrays.practice;

import java.util.Arrays;

public class Exercide6 {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        int[] Array2 = new int[10];

        for (int i = 0; i < 10; i++) {
            Array1[i] = (int) (Math.random() * 99 + 1);
        }
        Array2 = Array1.clone();
        Array1[9] = -7;
        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));
    }
}
