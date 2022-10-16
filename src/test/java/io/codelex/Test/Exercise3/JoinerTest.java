package io.codelex.Test.Exercise3;

import org.junit.jupiter.api.Test;

public class JoinerTest {

    public static void main(String[] args) {
        differentLength();
    }

    @Test
    private static void differentLength() {
        Joiner joiner = new Joiner<>("-");
        joiner.join("1");
        boolean test;
        if (joiner.toString().equals("1")) {
            test = true;
        }
        joiner.join("1", "2", "3");
        if (joiner.toString().equals("1-2-3")) {
            test = true;
        }
        if (test = true) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }
    }
}
