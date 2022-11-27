package io.codelex.polymorphism.practice.exercise1;

public class Mercedes implements Car, Optional {
    private Integer currentSpeed = 0;

    public void startEngine() {
        System.out.println("Boup...");
    }

    public void speedUp() {
        currentSpeed += 14;
    }

    public void slowDown() {
        currentSpeed -= 14;
    }

    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 40;
    }

}
