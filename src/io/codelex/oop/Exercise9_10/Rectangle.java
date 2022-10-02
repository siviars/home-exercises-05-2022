package io.codelex.oop.Exercise9_10;

public class Rectangle extends Shape {

    double with;
    double height;

    public Rectangle(double with, double height) {
        this.with = with;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return with * height;
    }

    @Override
    public double calculatePerimeter() {
        return with * 2 + height * 2;
    }
}
