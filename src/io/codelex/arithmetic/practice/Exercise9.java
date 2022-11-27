package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        double weight; //pounds
        double height; //inches
        double bmi;
        Scanner in = new Scanner(System.in);
        System.out.println("Write your weight kg");
        weight = in.nextDouble();
        System.out.println("Write your height cm");
        height = in.nextDouble();
        bmi = weight * 2.20462262 * 703 / Math.pow(height * 0.393700787, 2);
        if (bmi < 18.5) {
            System.out.println("Your have underweight. Body mass index " + Math.round(bmi * 100.0) / 100.0);
        } else if (bmi > 25) {
            System.out.println("Your have overweight. Body mass index " + Math.round(bmi * 100.0) / 100.0);
        } else {
            System.out.println("Your weight is optimal. Body mass index " + Math.round(bmi * 100.0) / 100.0);
        }
    }
}
