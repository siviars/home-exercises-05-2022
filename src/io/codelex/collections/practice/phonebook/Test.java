package io.codelex.collections.practice.phonebook;

public class Test {
    public static void main(String[] args) {
        PhoneDirectory one = new PhoneDirectory();
        one.putNumber("Jon", "031-55682");
        one.putNumber("Tom", "035-99846");
        System.out.println(one.getNumber("Jon"));
        System.out.println(one.getNumber("Anna"));
        one.putNumber("Tom", "000-98454");
        System.out.println(one.getNumber("Tom"));


    }
}
