package main.java.io.codelex.generics.practice.Exercise1;

public class OneClass_test {
    private String name;
    private String surname;


    public static void main(String[] args) {
        OneClass array = new OneClass();
        OneClass_test first = new OneClass_test("John", "Smith");
        OneClass_test second = new OneClass_test("Samanta", "Terner");
        array.add(1, first);
        array.add(2, second);
        System.out.println(array.get(1));

    }

    public OneClass_test(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
