package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private double width, height, thirdSide;

    public Triangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
        thirdSide = (int) (Math.sqrt(Math.pow(width, 2) + Math.pow(height / 2, 2)));
    }

    @Override
    public double getArea() {
        return (height * width) / 2;
    }

    @Override
    public double getPerimeter() {
        return thirdSide * 2 + height;
    }
}
