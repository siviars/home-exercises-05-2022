package io.codelex.classesandobjects.practice.Exercise1;

public class Product {
    private String name;
    private double priceAtStart;
    private int amountAtStart;

    public Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;
    }

    public void printProduct() {
        System.out.println(name + ", " + " price " + priceAtStart + ", " + " amount " + amountAtStart);
    }

    public int changeQuantity(int quantity) {
        return this.amountAtStart = quantity;
    }

    public double changePrice(double price) {
        return this.priceAtStart = price;
    }

}
