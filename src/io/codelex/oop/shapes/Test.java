package io.codelex.oop.shapes;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 8, 4);
        Rectangle rectangle = new Rectangle(4, 8, 6);

        System.out.println("Triangle area: " + triangle.getArea());
        System.out.println("Triangle perimeter: " + triangle.getPerimeter());
        System.out.println("Triangle sides: " + triangle.getNumSides());

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
        System.out.println("Rectangle sides: " + rectangle.getNumSides());

    }
}
