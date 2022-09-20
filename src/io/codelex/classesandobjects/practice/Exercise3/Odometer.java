package io.codelex.classesandobjects.practice.Exercise3;

public class Odometer {

    private int millage;

    public int amountOfMillage() {
        return millage;
    }

    public void incrementMilage() {
        millage++;
        if (millage == 1000000) {
            millage = 0;
        }
    }
}


