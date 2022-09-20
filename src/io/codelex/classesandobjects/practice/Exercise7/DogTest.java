package io.codelex.classesandobjects.practice.Exercise7;

public class DogTest {

    public static void main(String[] args) {
        Dog toMax = new Dog("Max", "male", "Lady", "Rocky");
        Dog toRocky = new Dog("Rocky", "male", "Molly", "Sam");
        Dog toSparky = new Dog("Sparky", "male");
        Dog toBuster = new Dog("Buster", "male", "Lady", "Sparky");
        Dog toSam = new Dog("Sam", "male");
        Dog toLady = new Dog("Lady", "female");
        Dog toMolly = new Dog("Molly", "female");
        Dog toCoco = new Dog("Coco", "female", "Molly", "Buster");
        System.out.println(toCoco.fathersName());
        System.out.println(toSparky.fathersName());
        System.out.println(toCoco.hasSameMotherAs("toRocky"));

    }
}
