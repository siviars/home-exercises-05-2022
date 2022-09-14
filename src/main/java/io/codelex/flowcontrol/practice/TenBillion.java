package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number less than ten billion: ");
        long n = in.nextLong();


        //todo - check if Long
        if (((Object)n).getClass().getSimpleName().equals("Long")){
            //todo - check if n is less than zero
            if (n < 0) {
                n *= -1;
            }
            //fixme
            line = Long.toString(n);

            if (line.length() >= 11) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 1;
                if (n>9&&n<100){
                    digits = 2;
                } else if (n>99&&n<1000){
                    digits = 3;
                } else if (n>999&&n<10000){
                    digits = 4;
                } else if (n>9999&&n<100000){
                    digits = 5;
                } else if (n>99999&&n<1000000){
                    digits = 6;
                } else if (n>999999&&n<10000000){
                    digits = 7;
                } else if (n>9999999&&n<100000000){
                    digits = 8;
                } else if (n>99999999&&n<1000000000){
                    digits = 9;
                } else if (n>999999999){
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } else{
            System.out.println("The number is not a long");
        }

    }

}
