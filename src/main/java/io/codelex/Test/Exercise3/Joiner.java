package io.codelex.Test.Exercise3;

import java.util.List;

public class Joiner<T> {
    String sep;

    String result;

    public Joiner(String sep) {
        this.sep = sep;
    }

    public void join(T... join) {
        result = "";
        List<T> list = List.of(join);
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                result = result + sep + list.get(i);
            } else {
                result = result + list.get(i);
            }
        }
    }

    public String toString() {
        return result;
    }

}
