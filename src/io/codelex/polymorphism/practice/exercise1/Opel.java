package io.codelex.polymorphism.practice.exercise1;

public class Opel implements Car {

    private Integer currentSpeed = 0;

    public void startEngine() {
        System.out.println("Puk...");
    }

    public void speedUp() {
        currentSpeed += 6;
    }

    public void slowDown() {
        currentSpeed -= 6;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

}
