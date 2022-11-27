package io.codelex.oop.parcels;

public class Test {
    public static void main(String[] args) {
        Parcel one = new Parcel(30, 40, 50, 10, true);
        Parcel two = new Parcel(30, 40, 50, 20, true);
        Parcel three = new Parcel(30, 40, 50, 35, false);
        Parcel four = new Parcel(100, 150, 100, 10, true);
        Parcel five = new Parcel(25, 40, 50, 10, true);

        System.out.println(one.validate());
        System.out.println(two.validate());
        System.out.println(three.validate());
        System.out.println(four.validate());
        System.out.println(five.validate());

    }
}
