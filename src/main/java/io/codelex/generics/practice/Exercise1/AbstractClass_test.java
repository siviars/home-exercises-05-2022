package main.java.io.codelex.generics.practice.Exercise1;

import java.util.HashMap;
import java.util.Map;

public class AbstractClass_test extends AbstractClass{

    private String name;
    private String surname;

    private int i;
    private Object el;

    private static Map<Integer, Object> users = new HashMap<>();

    public static void main(String[] args) {
        AbstractClass_test array = new AbstractClass_test();
        AbstractClass_test first = new AbstractClass_test("John", "Smith");
        AbstractClass_test second = new AbstractClass_test("Samanta", "Terner");
        array.add(1, first);
        array.add(2, second);
        System.out.println(array.get(1));

    }

    public AbstractClass_test(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public AbstractClass_test() {

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

