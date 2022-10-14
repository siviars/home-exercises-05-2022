package io.codelex.Test.Exercise2;

public class Apple extends Basket{

    public Apple(int numbers, Object items) {
        super(numbers,items);
    }

    @Override
    public void addToBasket(int num, Object item) {
        super.addToBasket(num, item);
    }

    @Override
    public void removeFromBasket(int num, Object item) {
        super.removeFromBasket(num, item);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
