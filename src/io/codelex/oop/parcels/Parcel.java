package io.codelex.oop.parcels;

public class Parcel implements Validatable {

    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;
    private final int SIZE = 30;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    @Override
    public boolean validate() {
        if (xLength >= SIZE && yLength >= SIZE && zLength >= SIZE) {
            if (xLength + yLength + zLength <= 300) {
                if (isExpress) {
                    if (weight <= 15) {
                        System.out.println("Parcel is correct");
                        return true;
                    } else {
                        System.out.println("Parcel weight is to large for Express");
                        return false;
                    }
                } else {
                    if (weight <= SIZE) {
                        System.out.println("Parcel is correct");
                        return true;
                    } else {
                        System.out.println("Parcel weight is to large");
                        return false;
                    }
                }
            } else {
                System.out.println("Parcel size is to large");
                return false;
            }
        } else {
            System.out.println("Parcel length is to small");
            return false;
        }
    }
}