package io.codelex.Test.Exercise2;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Mushroom mushroom = new Mushroom();
        Basket basket = new Basket();
        for (int i = 1; i <= 10; i++) {
            basket.addToBasket(apple);
        }
        basket.addToBasket(apple);
        basket.removeFromBasket(apple);
        basket.addToBasket(mushroom);
        basket.removeFromBasket(mushroom);
        System.out.println(basket);
        for (int i = 9; i >= 1; i--) {
            basket.removeFromBasket(apple);
        }
        basket.removeFromBasket(apple);
        basket.addToBasket(mushroom);
        basket.addToBasket(apple);
        System.out.println(basket);
    }
}
