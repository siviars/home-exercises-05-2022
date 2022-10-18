package io.codelex.classesandobjects.practice.Exercise2;

import java.util.Scanner;

public class Car {

    private double startKilometers;
    private double endKilometers;
    private double liters;
    private final int max = 15;
    private final int min = 5;

    public Car(double startKilometers) {
        this.startKilometers = startKilometers;
    }

    public Car(double startKilometers, double endKilometers, double liters) {
        this.startKilometers = startKilometers;
        this.endKilometers = endKilometers;
        this.liters = liters;
    }

    public double calculateConsumption() {
        return liters / ((endKilometers - startKilometers) / 100);
    }

    public boolean gasHog() {
        return calculateConsumption() > max;
    }

    public boolean economyCar() {
        return calculateConsumption() < min;
    }

    public void fillUp(double mileage, double liters) {
        endKilometers = mileage;
        this.liters = liters;
    }


}
