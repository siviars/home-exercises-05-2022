package io.codelex.Test.Exercise2;

import java.util.HashMap;
import java.util.Map;

public abstract class Basket<T> {
    T items;
    int numbers;

    Map<Integer, T> basket = new HashMap<>();

    public Basket(int numbers, T items) {
        this.items = items;
        this.numbers = numbers;
    }

    public void addToBasket(int num, T item) {
        if (basket.size()==10) {
            System.out.println("Basket is full");
        } else {
            basket.put(num, item);
        }

    }

    public <T> void removeFromBasket(int num, T item) {
        if (basket.size() == 0) {
            System.out.println("Basket is emty");
        } else {
            basket.remove(num, item);

        }
    }

    @Override
    public String toString() {
        return "Basket{" +
               ", basket=" + basket +
                '}';
    }
}



