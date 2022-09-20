package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

public class LitersPerKilometer {


    public static void main(String[] args) {

        double startKilometers;
        double endKilometers;
        double liters;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());

        Car car2 = new Car(100, 350, 20);

        System.out.println("Kilometers per liter are " + car2.calculateConsumption());


    }

}






