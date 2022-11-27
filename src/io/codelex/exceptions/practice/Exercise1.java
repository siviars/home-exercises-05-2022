package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        while (true) {
            try {
                System.out.println("Enter the numerator");
                String input = scanner.next();
                if (input.charAt(0) == 'q' || input.charAt(0) == 'Q')
                    break;
                numerator = Integer.valueOf(input);
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + numerator / divisor);
            } catch (ArithmeticException e) {
                System.out.println("You can't divide " + numerator + " by 0");
            } catch (NumberFormatException e) {
                System.out.println("You entered bad data.Please try again.");
            } catch (InputMismatchException e) {
                System.out.println("You entered bad data.Please try again.");
                scanner.next();
            }
        }
    }
}
