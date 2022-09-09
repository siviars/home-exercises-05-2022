package io.codelex.arithmetic.practice;

public class Exercise8 {

    static double count;

    public static void Payment(double basePay, int hoursWorked) {
        if (basePay < 8) {
            System.out.println("Error, base pay < $8.00");
        } else if (hoursWorked > 60) {
            System.out.println("Error, hours work > 60");
        } else {
            if (hoursWorked <= 40) {
                count = hoursWorked * basePay;
            } else {
                count = 40 * basePay + (hoursWorked - 40) * basePay * 1.5;
            }
            System.out.println("Employee salary is $" + count );
        }
    }

    public static void main(String[] args) {
        Payment(7.50, 35);
        Payment(8.20, 47);
        Payment(10, 73);


    }
}
