package io.codelex.Test.Exercise2;

public class BasketEmptyException extends RuntimeException {
    public BasketEmptyException(String message) {
        System.out.println(message);
    }
}
