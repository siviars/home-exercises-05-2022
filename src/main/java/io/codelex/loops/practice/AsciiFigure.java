package io.codelex.loops.practice;

import java.util.Scanner;

public class AsciiFigure {
    public static void main(String[] args) {
        int count, heig, slash, asterisk;
        int leng = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Write figure size");
        heig = in.nextInt();
        count = heig / 2;

        //count figure length
        for (int i = 1; i <= count; i++) {
            leng = leng + 16;
        }

        //Draw figure
        slash = leng / 2;
        asterisk = 0;
        for (int k = 1; k <= heig; k++) {
            for (int l = 1; l <= slash; l++) {
                System.out.print("/");
            }
            for (int j = 1; j <= asterisk; j++) {
                System.out.print("*");
            }
            for (int l = 1; l <= slash; l++) {
                System.out.print("\\");
            }
            System.out.println("");
            asterisk = asterisk + 8;
            slash = slash - 4;
        }
    }
}
