package io.codelex.exceptions.practice;

public class Exercise2 {
    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() throws ArithmeticException {
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Error1");
        }
    }

    public static void methodB() throws ArithmeticException {
        try {
            methodC();
        } catch (Exception e) {
            System.out.println("Error2");
        }
    }

    public static void methodC() throws ArithmeticException {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
        } catch (Exception e) {
            System.out.println("Error3");
        }
    }
}
