package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;

public class Exercide6 {
    public static void main(String[] args) {
        int[] Array1 = new int[10];
        int[] Array2;
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            Array1[i] = rand.nextInt(100);
        }
        Array2 = Array1.clone();
        Array1[Array1.length - 1] = -7;
        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));
    }
}
