package io.codelex.typesandvariables.practice;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        String myName = "Zed A. Shaw";
        int Age = 35;
        double height = 74 * 2.54;  // inches
        double weight = 180 * 0.453592; // lbs
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";
        double formatHeight = Math.round(height * 100.0) / 100.0; //inch to cm
        double formatWeight = Math.round(weight * 100.0) / 100.0; //lbs to kg


        System.out.println("Let's talk about " + myName + ".");
        System.out.println("He's " + formatHeight + " cm tall.");
        System.out.println("He's " + formatWeight + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + Age + ", " + formatHeight + ", and " + formatWeight
                + " I get " + (Age + formatHeight + formatWeight) + ".");
    }
}