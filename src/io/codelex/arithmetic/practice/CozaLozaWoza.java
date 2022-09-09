package io.codelex.arithmetic.practice;

public class CozaLozaWoza {

    public static void main(String[] args) {
        int number;
        boolean multiple;
        for (int i = 1; i <= 11; i++) {
            multiple = false;
            number = (int) (Math.random() * 109 + 1);
            if (number % 3 == 0) {
                System.out.print("Coza");
                multiple = true;
            }
            if (number % 5 == 0) {
                System.out.print("Loza");
                multiple = true;
            }
            if (number % 7 == 0) {
                System.out.print("Woza");
                multiple = true;
            }
            if (multiple) {
                System.out.print(" ");
            } else {
                System.out.print(number + " ");
            }
        }

    }
}
