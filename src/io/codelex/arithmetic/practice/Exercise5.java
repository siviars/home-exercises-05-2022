package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        int number = in.nextInt();
        int random = (int)(Math.random()*99+1);
        if(number>random){
            System.out.println("Sorry, you are too high.  I was thinking of "+random);
        }else if(number<random){
            System.out.println("Sorry, you are too low.  I was thinking of "+random);
        }else{
            System.out.println("You guessed it!  What are the odds?!?");
        }
    }
}
