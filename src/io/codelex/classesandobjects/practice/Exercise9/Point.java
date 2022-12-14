package io.codelex.classesandobjects.practice.Exercise9;

public class Point {
    private int x;
    private int y;

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);

        swapPoints(p1, p2);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private static void swapPoints(Point p1, Point p2) {
        int x2 = p1.x;
        int y2 = p1.y;
        p1.x = p2.x;
        p1.y = p2.y;
        p2.x = x2;
        p2.y = y2;
    }

}
