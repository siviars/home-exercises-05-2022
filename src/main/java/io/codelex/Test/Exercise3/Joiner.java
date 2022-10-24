package io.codelex.Test.Exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {
    String sep;

    public Joiner(String sep) {
        this.sep = sep;
    }

    public String join(T... join) {
        return Arrays.stream(join).map(Object::toString).collect(Collectors.joining(sep));
    }
}
