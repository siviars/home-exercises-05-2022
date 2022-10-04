package io.codelex.loops.practice;

import java.util.Scanner;

public class MultiplyByItself {

    public static void main(String[] args) {
        int i, n;
        Scanner in = new Scanner(System.in);

        System.out.print("Input number : ");
        i = in.nextInt();
        System.out.print("Input number of terms : ");
        n = in.nextInt();

        int number = i;
        for (int j = 1; j < n; j++) {
            number = number * i;
        }
        System.out.println("Your number multiple is " + number);

        /*
        todo - complete loop to multiply i with itself n times, it is NOT allowed to use Math.pow()
        for (.......) {
          System.out.println(........);
        }
        */
    }

}
