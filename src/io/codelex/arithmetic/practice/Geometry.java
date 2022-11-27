package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(double radius) {
        return Math.PI * radius * 2;
    }

    static double areaOfRectangle(double length, double width) {
        return length * width;
    }

    static double areaOfTriangle(double base, double h) {
        return base * h * 0.5;
    }
}
