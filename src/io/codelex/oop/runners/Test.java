package io.codelex.oop.runners;

public class Test {
    public static void main(String[] args) {
        Runner one = Runner.BEGINNER;
        Runner two = Runner.BEGINNER;
        Runner three = Runner.BEGINNER;

        System.out.println(one.getFitnessLevel(45));
        System.out.println(two.getFitnessLevel(25));
        System.out.println(three.getFitnessLevel(15));

    }
}
