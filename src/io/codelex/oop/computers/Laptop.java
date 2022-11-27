package io.codelex.oop.computers;

import java.util.Objects;

public class Laptop extends Computer {

    String power;
    String size;
    String weight;
    String serial;

    public static void main(String[] args) {
        Laptop oneL = new Laptop("IntelCore i5", "128Gb", "GeForce GTX1650","8Gb","ASUS","GF876","5000Ah","300x200x30","250","324435");
        Laptop twoL = new Laptop("IntelCore i7", "256Gb", "GeForce RTX3060","8Gb","LENOVO","UG89","4400Ah","250x200x25","240","324432545");
        Laptop threeL = new Laptop("IntelCore i3", "64Gb", "GeForce GT730","8Gb","DELL","ACH34","5200Ah","280x220x28","300","45426");
        Laptop fourL = new Laptop("AMD Ryzen 7", "256Gb", "Radeon RX 6600","8Gb","HP","OTV35","4800Ah","275x195x27","280","745643");
        Laptop fiveL = new Laptop("AMD Ryzen 5", "128Gb", "Radeon RX550X","8Gb","MSI","UZV24","4600Ah","260x190x26","270","4587324");

        System.out.println(oneL.getProcessor());
        System.out.println(twoL.getCompany());
        threeL.setCompany("IBM");
        fourL.setWeight("300");
        System.out.println(fiveL.getPower());
        oneL.setGraphics("6Gb");


    }

      public Laptop(String processor, String ram, String graphics, String card, String company, String model, String power, String size, String weight, String serial) {
        super(processor, ram, graphics, card, company, model);
        this.power = power;
        this.size = size;
        this.weight = weight;
        this.serial = serial;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(power, laptop.power) && Objects.equals(size, laptop.size) && Objects.equals(weight, laptop.weight) && Objects.equals(serial, laptop.serial);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), power, size, weight, serial);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "power='" + power + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                ", serial='" + serial + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphics='" + graphics + '\'' +
                ", card='" + card + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
