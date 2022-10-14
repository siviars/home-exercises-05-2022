package main.java.io.codelex.generics.practice.Exercise1;

import java.util.HashMap;
import java.util.Map;

public class  Interface_test implements Interface{

    private String name;
    private String surname;

    private int i;
    private Object el;

    private static Map<Integer, Object> users = new HashMap<>();

    public static void main(String[] args) {
        Interface_test array = new Interface_test();
        Interface_test first = new Interface_test("John", "Smith");
        Interface_test second = new Interface_test("Samanta", "Terner");
        array.add(1, first);
        array.add(2, second);
        System.out.println(array.get(1));

    }

    public Interface_test(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Interface_test() {

    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }



    @Override
    public void add(int i, Object el) {
        this.i = i;
        this.el = el;
        users.put(i, el);
    }

    @Override
    public Object get(int i) {
        return users.get(i);
    }
}
