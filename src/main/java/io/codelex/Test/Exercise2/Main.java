package io.codelex.Test.Exercise2;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Mushroom mushroom = new Mushroom();
        Basket<Apple> basket = new Basket();
        Basket<Mushroom> basket2 = new Basket();
        for (int i = 1; i <= 10; i++) {
            basket.addToBasket(apple);
        }
        basket.addToBasket(apple);
        System.out.println(basket);

        basket2.addToBasket(mushroom);
        basket2.removeFromBasket(mushroom);
        basket2.removeFromBasket(mushroom);
    }
}
