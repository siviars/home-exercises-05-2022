package io.codelex.enums.practice.Exercise1;

public enum CardinalPoints {
    North("up"),
    South("down"),
    East("right"),
    West("left");

    String direction;

    CardinalPoints(String direction) {
        this.direction = direction;
    }


}
