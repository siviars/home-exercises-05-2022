package main.java.io.codelex.generics.practice.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {

    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        List<String> string2 = new ArrayList<>();
        List<Object> object = new ArrayList<>();
        List<Integer> integer = new ArrayList<>();
        add("string", string);
        add("string2", string2);
        add(1, integer);
        add("object", object);
        addAllX(string, object);
        addAllY(string, string2);
    }

    public static <T> void add(T value, List<T> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> v, List<? super V> l) {
        for (V el : v) l.add(el);
    }

    public static <V> void addAllY(List<V> v, List<V> l) {
        for (V el : v) l.add(el);
    }

}
