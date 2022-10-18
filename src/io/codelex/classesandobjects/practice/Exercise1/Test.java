package io.codelex.classesandobjects.practice.Exercise1;

public class Test {
    public static void main(String[] args) {
        Product prod1 = new Product("Logitech mouse", 70.00, 14);
        Product prod2 = new Product("iPhone 5s", 999.99, 3);
        Product prod3 = new Product("Epson EB-U05", 440.46, 1);
        prod1.printProduct();
        prod2.printProduct();
        prod3.printProduct();
        prod1.changeQuantity(10);
        prod1.printProduct();
        prod2.changePrice(800.80);
        prod2.printProduct();
    }
}
