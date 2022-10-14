package main.java.io.codelex.generics.practice.Exercise1;

import java.util.HashMap;
import java.util.Map;

public class OneClass {

    private int i;
    private Object el;

    private static Map<Integer, Object> users = new HashMap<>();


    public void add(int i, Object el) {
        this.i = i;
        this.el = el;
        users.put(i, el);
    }

    public Object get(int i) {
        return users.get(i);
    }

}
