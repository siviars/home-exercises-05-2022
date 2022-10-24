package io.codelex.Test.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    private List<T> basket = new ArrayList<>();

    public void addToBasket(T item) {
        if (basket.size() == 10) {
            throw new BasketFullException("Basket is full");
        } else {
            basket.add(item);
        }
    }

    public void removeFromBasket(T item) {
        if (basket.size() == 0) {
            throw new BasketEmptyException("Basket is empty");
        } else {
            basket.remove(item);
        }
    }

    public int getBasketSize() {
        return basket.size();
    }

    @Override
    public String toString() {
        return "Basket{" +
                "basket=" + basket.get(0) +
                ", size=" + basket.size() +
                '}';
    }
}



