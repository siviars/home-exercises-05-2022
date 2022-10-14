package io.codelex.Test.Exercise2;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple(1, "Apple1");
        Mushroom mushroom = new Mushroom(1,"Mushrom1");
        apple.addToBasket(2,"Apple2");
        apple.addToBasket(3,"Apple3");
        apple.addToBasket(4,"Apple4");
        apple.addToBasket(5,"Apple5");
        apple.addToBasket(6,"Apple6");
        apple.addToBasket(7,"Apple7");
        apple.addToBasket(8,"Apple8");
        apple.addToBasket(9,"Apple9");
        apple.addToBasket(10,"Apple10");
        apple.addToBasket(11,"Apple11");
        apple.addToBasket(11,"Apple12");
        mushroom.addToBasket(2, "Mushrom2");
        mushroom.removeFromBasket(2, "Mushrom2");
        mushroom.removeFromBasket(3, "Mushrom3");
        System.out.println(apple);
        System.out.println(mushroom);
    }
}
