package io.codelex.polymorphism.practice.exercise3;

public class Main {
    public static void main(String[] args) {
        Person jon = new Student("Jon", "Peterson", "Jork street", 1, 7.8);
        Employee clark = new Employee("Clark", "Bazalski", "Henzen street", 2, "Microsoft");
        jon.display();
        clark.display();

    }
}
