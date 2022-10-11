package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] information2;

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Input animal by format: Animal type, animal name, animal weight, animal living region, optional");
            String input = scanner.nextLine();
            String[] information = input.split(" ");
            System.out.println(Arrays.toString(information));
            if (information[0].equals("End")) {
                break;
            }
            if (information[0].equals("Cat")) {
                Cat cat = new Cat(information[0], information[1], Double.valueOf(information[2]), null, information[3], information[4]);
                animals.add(cat);
                cat.makeSound();
                readFood();
                if (information2[0].equals("Meat")) {
                    cat.eat(new Meat(Integer.valueOf(information2[1])));
                } else {
                    cat.eat(new Vegetable(Integer.valueOf(information2[1])));
                }
                System.out.println(cat.toString());
            } else if (information[0].equals("Tiger")) {
                Tiger tiger = new Tiger(information[0], information[1], Double.valueOf(information[2]), null, information[3]);
                animals.add(tiger);
                tiger.makeSound();
                readFood();
                if (information2[0].equals("Meat")) {
                    tiger.eat(new Meat(Integer.valueOf(information2[1])));
                } else {
                    tiger.eat(new Vegetable(Integer.valueOf(information2[1])));
                }
                System.out.println(tiger.toString());
            } else if (information[0].equals("Zebra")) {
                Zebra zebra = new Zebra(information[0], information[1], Double.valueOf(information[2]), null, information[3]);
                animals.add(zebra);
                zebra.makeSound();
                readFood();
                if (information2[0].equals("Meat")) {
                    zebra.eat(new Meat(Integer.valueOf(information2[1])));
                } else {
                    zebra.eat(new Vegetable(Integer.valueOf(information2[1])));
                }
                System.out.println(zebra.toString());
            } else if (information[0].equals("Mouse")) {
                Mouse mouse = new Mouse(information[0], information[1], Double.valueOf(information[2]), null, information[3]);
                animals.add(mouse);
                mouse.makeSound();
                readFood();
                if (information2[0].equals("Meat")) {
                    mouse.eat(new Meat(Integer.valueOf(information2[1])));
                } else {
                    mouse.eat(new Vegetable(Integer.valueOf(information2[1])));
                }
                System.out.println(mouse.toString());
            }
        }
        System.out.println(animals.toString());
    }

    public static void readFood() {
        System.out.println("Input animal food by format: Food type, quantity");
        String input = scanner.nextLine();
        information2 = input.split(" ");
    }
}
