package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Objects;

public class Car {
    String name;
    String model;
    EngineType engineType;
    int price;
    int year;
    Manufacturer manufacturers;
    ArrayList<Manufacturer> manufacturer = new ArrayList<>();

    public Car(String name, String model, EngineType engineType, int price, int year, Manufacturer manufacturers) {
        this.name = name;
        this.model = model;
        this.engineType = engineType;
        this.price = price;
        this.year = year;
        this.manufacturers = manufacturers;
        manufacturer.add(manufacturers);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Manufacturer getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(Manufacturer manufacturers) {
        this.manufacturers = manufacturers;
    }

    public ArrayList<Manufacturer> getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(ArrayList<Manufacturer> manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", engineType=" + engineType +
                ", price=" + price +
                ", year=" + year +
                ", manufacturer=" + manufacturer +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && year == car.year && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(engineType, car.engineType) && Objects.equals(manufacturer, car.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, engineType, price, year, manufacturer);
    }
}
