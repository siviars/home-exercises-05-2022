package io.codelex.enums.practice.Exercise1;

public class Test {
    public static void main(String[] args) {
        CardinalPoints right = CardinalPoints.East;
        CardinalPoints up = CardinalPoints.North;
        CardinalPoints down = CardinalPoints.South;
        CardinalPoints left = CardinalPoints.West;

        System.out.println(CardinalPoints.North + ":" + up.direction + ":" + up.ordinal());
        System.out.println(CardinalPoints.South + ":" + down.direction + ":" + down.ordinal());
        System.out.println(CardinalPoints.East + ":" + right.direction + ":" + right.ordinal());
        System.out.println(CardinalPoints.West + ":" + left.direction + ":" + left.ordinal());
    }
}
