package io.codelex.oop.runners;

import java.util.Arrays;

public enum Runner {
    BEGINNER(40, 60),
    INTERMEDIATE(20, 39),
    ADVANCED(10, 19);

    private int min;
    private int max;
    private int time;

    Runner(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public String getFitnessLevel(int time) {
        this.time = time;
        return String.valueOf(Arrays.stream(Runner.values())
                .filter(level -> level.min <= time && level.max >= time)
                .findFirst());
    }

}
