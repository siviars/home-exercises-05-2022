package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        double startKilometers;
        double endKilometers;
        double liters;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter car1 first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter car1 second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter car1 liters consumed: ");
        liters = scan.nextDouble();

        Car car = new Car(startKilometers, endKilometers, liters);

        System.out.print("Enter car2 first reading: ");
        startKilometers = scan.nextDouble();

        System.out.print("Enter car2 second reading: ");
        endKilometers = scan.nextDouble();

        System.out.print("Enter car2 liters consumed: ");
        liters = scan.nextDouble();

        Car car2 = new Car(startKilometers, endKilometers, liters);

        System.out.println("Kilometers per liter are " + car.calculateConsumption());

        System.out.println("Kilometers per liter are " + car2.calculateConsumption());

        Car car3 = new Car(0);

        car3.fillUp(100, 8);
        System.out.println("Kilometers per liter are " + car3.calculateConsumption());

        Car car4 = new Car(300);

        car4.fillUp(520, 14);
        System.out.println("Kilometers per liter are " + car4.calculateConsumption());

    }
}
