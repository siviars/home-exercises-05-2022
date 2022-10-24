package io.codelex.Test.Exercise2;

public class BasketFullException extends RuntimeException {
    public BasketFullException(String message) {
        System.out.println(message);
    }
}
