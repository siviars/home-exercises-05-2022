package io.codelex.oop.exercise9and10;

public class Qube extends ThreeDShape {
    private double side;

    public Qube(double side) {
        this.side = side;
    }

    @Override
    public double calculateVolume() {
        return side * 3;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }
}
