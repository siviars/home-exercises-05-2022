package io.codelex.oop.Exercise9_10;

public class Hexagon extends Shape {
    double side;

    public Hexagon(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return (3 * Math.sqrt(3) * Math.pow(side, 2)) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return 6 * side;
    }
}
