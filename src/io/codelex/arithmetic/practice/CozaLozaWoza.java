package io.codelex.arithmetic.practice;

public class CozaLozaWoza {

    public static void main(String[] args) {
        boolean multiple;
        for (int i = 1; i <= 110; i++) {
            multiple = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                multiple = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                multiple = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                multiple = true;
            }
            if (multiple) {
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
            if (i % 11 == 0) {
                System.out.println();
            }
        }
    }
}
