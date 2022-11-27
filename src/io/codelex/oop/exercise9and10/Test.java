package io.codelex.oop.exercise9and10;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(4, 5, 6);
        Hexagon hexagon = new Hexagon(6);
        Cone cone = new Cone(9, 4);
        Qube qube = new Qube(5);

        System.out.println("Rectangle perimeter " + rectangle.calculatePerimeter());
        System.out.println("Rectangle area " + rectangle.calculateArea());
        System.out.println("Triangle perimeter " + triangle.calculatePerimeter());
        System.out.println("Triangle area " + triangle.calculateArea());
        System.out.println("Hexagon perimeter " + hexagon.calculatePerimeter());
        System.out.println("Hexagon area " + hexagon.calculateArea());
        System.out.println("Cone volume "+ cone.calculateVolume());
        System.out.println("Qube volume "+ qube.calculateVolume());
    }
}
