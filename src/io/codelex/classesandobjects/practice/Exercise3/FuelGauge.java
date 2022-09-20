package io.codelex.classesandobjects.practice.Exercise3;

public class FuelGauge {

    private int amountOfFuel;

    public int amountOfFuel() {
        return amountOfFuel;
    }

    public void incrementFuel() {
        amountOfFuel++;
    }

    public void decrementFuel() {
        if (amountOfFuel > 0) {
            amountOfFuel--;
        }
    }
}
