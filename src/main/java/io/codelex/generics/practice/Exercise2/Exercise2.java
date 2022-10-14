package main.java.io.codelex.generics.practice.Exercise2;

import java.util.ArrayList;
import java.util.List;


public class Exercise2 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("word");
        System.out.println(concatenate(string));

        List<Integer> integer = new ArrayList<>();
        integer.add(1);
        System.out.println(concatenate(integer));

        List<Object> object = new ArrayList<>();
        object.add(new Object());
        System.out.println(concatenate(object));

    }

    public static <T> String concatenate(List<T> list) {
        String result = "";
        String separator = "";
        if (list.get(0) instanceof String) {
            result = "String:";
            separator = " ";
        } else if (list.get(0) instanceof Integer) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }


}

