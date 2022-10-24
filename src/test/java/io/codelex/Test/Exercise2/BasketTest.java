package io.codelex.Test.Exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {
    public static void main(String[] args) {
        appleBasket();
        mushroomBasket();
        fullBasket();
        emptyBasket();
    }

    @Test
    private static void appleBasket() {
        Apple apple = new Apple();
        Basket<Apple> basket = new Basket();
        basket.addToBasket(apple);
        Assertions.assertEquals(1, basket.getBasketSize());
    }

    @Test
    private static void mushroomBasket() {
        Mushroom mushroom = new Mushroom();
        Basket<Mushroom> basket = new Basket();
        basket.addToBasket(mushroom);
        Assertions.assertEquals(1, basket.getBasketSize());
    }


    @Test
    private static void fullBasket() {
        Apple apple = new Apple();
        Basket<Apple> basket = new Basket();
        for (int i = 0; i < 10; i++) {
            basket.addToBasket(apple);
        }
        Assertions.assertThrows(BasketFullException.class, () -> basket.addToBasket(apple));
    }

    @Test
    private static void emptyBasket() {
        Mushroom mushroom = new Mushroom();
        Basket<Mushroom> basket = new Basket();
        Assertions.assertThrows(BasketEmptyException.class, () -> basket.removeFromBasket(mushroom));
    }

}
