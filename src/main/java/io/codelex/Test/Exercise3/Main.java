package io.codelex.Test.Exercise3;

public class Main {
    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        System.out.println(joiner.join(1, 2, 3));
        System.out.println(joiner.join("a", "b", "c"));
        System.out.println(joiner.join('1', '2', '3'));
    }
}
