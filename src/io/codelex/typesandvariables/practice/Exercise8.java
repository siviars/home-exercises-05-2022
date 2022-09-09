package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        int min = 0;
        int hours = 0;
        int days = 0;
        int years = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Write minutes");
        int counter = in.nextInt();
        if (counter / 60 >= 1) {
            hours = counter / 60;
            min = counter % 60;
            if (hours / 24 >= 1) {
                days = hours / 24;
                hours = hours % 24;
                if (days / 356 >= 1) {
                    years = days / 356;
                    days = days % 356;
                }
            }
        } else {
            min = counter;
        }
        System.out.println(years + " years " + days + " days " + hours + " hours " + min + " min");
    }
}
