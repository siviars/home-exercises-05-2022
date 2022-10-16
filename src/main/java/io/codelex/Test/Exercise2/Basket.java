package io.codelex.Test.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    T items;

    private List<T> basket = new ArrayList<>();

    public void addToBasket(T item) {
        if (basket.size() == 10) {
            System.out.println("Basket is full");
        } else if (basket.size() > 0) {
            if (basket.get(0) == item) {
                basket.add(item);
            } else {
                System.out.println("Not the same item");
            }
        } else {
            basket.add(item);
        }
    }

    public void removeFromBasket(T item) {
        if (basket.size() == 0) {
            System.out.println("Basket is emty");
        } else if (basket.get(0) == item) {
            basket.remove(basket.size() - 1);
        } else {
            System.out.println("In basket not such item");
        }
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket.get(0) +
                ", size=" + basket.size() +
                '}';
    }
}



