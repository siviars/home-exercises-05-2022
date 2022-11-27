package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input distance in meters:");
        double distance = in.nextDouble();
        System.out.println("Input hour:");
        double hour = in.nextDouble();
        System.out.println("Input minutes:");
        double minutes = in.nextDouble();
        System.out.println("Input seconds:");
        double seconds = in.nextDouble();

        double ms = distance / (hour * 3600 + minutes * 60 + seconds);
        double kmh = (distance / 1000) / (hour + minutes / 60 + seconds / 360);
        double milh = (distance / 1609) / (hour + minutes / 60 + seconds / 360);

        System.out.println("Your speed in meters/second is " + ms);
        System.out.println("Your speed in km/h is " + kmh);
        System.out.println("Your speed in miles/h is " + milh);

    }
}
