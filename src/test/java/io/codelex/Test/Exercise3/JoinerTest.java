package io.codelex.Test.Exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JoinerTest {

    public static void main(String[] args) {
        joinCorrect();
    }

    @Test
    private static void joinCorrect() {
        Joiner joiner = new Joiner<>("-");
        Assertions.assertEquals("1-2-3",joiner.join(1,2,3));
    }
}
