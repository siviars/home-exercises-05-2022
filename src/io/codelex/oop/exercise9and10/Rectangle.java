package io.codelex.oop.exercise9and10;

public class Rectangle extends Shape {
    private  double with;
    private  double height;

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
