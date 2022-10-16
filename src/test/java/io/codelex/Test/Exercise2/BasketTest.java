package io.codelex.Test.Exercise2;

import org.junit.jupiter.api.Test;

public class BasketTest {

    public static void main(String[] args) {
        diferentItems();
    }

    @Test
    private static void diferentItems() {
        Basket basket = new Basket();
        basket.addToBasket("one");
        basket.addToBasket("two");
        if (basket.toString().indexOf("two") < 0) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }
    }
}
