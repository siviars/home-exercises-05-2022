package io.codelex.exceptions.practice;

public class Exercise4 {
    public static void main(String[] args) {
        try {
            double d = getInput(args[0]);
            double root = Math.sqrt(d);
            System.out.println(
                    "The square root of " + d + " is " + root);
        } catch (NumberFormatException e) {
            System.out.println("Be sure to enter a number.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Enter number as first parameter.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static double getInput(String s) throws Exception {
        double d = new Double(s).doubleValue();
        if (d < 0) {
            throw new Exception("Negative number entered");
        }
        // Throw an NonPositiveNumberException if d is less than 0
        return d;
    }
}
