package io.codelex.Test.Exercise3;

import java.util.function.BiFunction;

public class Joiner<T> {

    T join;
    String sep;

    public Joiner(String sep, T join) {
        this.join = join;
        this.sep = sep;
    }

    public void join() {

    }
}
