package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(int numSides, double with, double height) {
        super(numSides);
        this.width = with;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }
}
