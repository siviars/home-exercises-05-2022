package io.codelex.classesandobjects.practice.Exercise7;

public class Dog {
    public String name;
    public String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getMother(String name) {
        this.name = name;
        return mother;
    }

    public String fathersName() {
        if (father == null) {
            return "Unknown";
        } else {
            return father;
        }
    }

    public boolean hasSameMotherAs(String name) {
        if (this.mother.equals(getMother(name))) {
            return true;
        } else {
            return false;
        }
    }

}
