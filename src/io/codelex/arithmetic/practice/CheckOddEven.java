package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class CheckOddEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Write number");
        int number = in.nextInt();
        if(number%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }
        System.out.println("bye!");
    }
}
