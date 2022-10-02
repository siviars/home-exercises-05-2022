package io.codelex.oop.Exercise9_10;

public class Cone extends ThreeDShape {

    double height;
    double radius;

    public Cone(double height,double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    public double calculateVolume() {
        return height*Math.PI*Math.pow(radius,2)*0.11;
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
