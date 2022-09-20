package io.codelex.classesandobjects.practice.Exercise3;

public class Main {
    public static void main(String[] args) {
        FuelGauge fuel1 = new FuelGauge();
        Odometer odom1 = new Odometer();

        //Fill fuel 20L
        for (int i = 1; i <= 20; i++) {
            fuel1.incrementFuel();
        }

        //Check fuel
        System.out.println("Amount of fuel: " + fuel1.amountOfFuel());

        //Start drive 205km
        for (int j = 1; j <= 205; j++) {
            if (j % 10 == 0) {
                fuel1.decrementFuel();
            }
            if (fuel1.amountOfFuel() > 0) {
                odom1.incrementMilage();
            } else {
                System.out.println("Not fuel");
                break;
            }
            System.out.println("Amount of milage: " + odom1.amountOfMillage());
            System.out.println("Amount of fuel: " + fuel1.amountOfFuel());
        }
    }
}
