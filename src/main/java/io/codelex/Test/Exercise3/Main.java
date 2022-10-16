package io.codelex.Test.Exercise3;

public class Main {
    public static void main(String[] args) {
        Joiner joiner = new Joiner("-");
        joiner.join(1,2,3);
        System.out.println(joiner.toString());
        joiner.join("a","b","c");
        System.out.println(joiner.toString());
        joiner.join('1', '2', '3');
        System.out.println(joiner.toString());
    }
}
