package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class LargestNumber {

    //TODO: Write a Java program to to find the largest of three numbers.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largNum;
        System.out.print("Input the 1st number: ");
        int num1 = in.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = in.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = in.nextInt();
        largNum = num1;
        if (num2 > largNum) {
            largNum = num2;
        }
        if (num3 > largNum) {
            largNum = num3;
        }
        System.out.println("Largest number is " + largNum);

        /*
        todo - expected output:
        Input the 1st number: 25
        Input the 2nd number: 78
        Input the 3rd number: 87
         */
    }

}
