package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CarService {
    public ArrayList<Car> carsList;

    public CarService() {
        this.carsList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carsList.add(car);
    }

    public void removeCar(Car car) {
        carsList.remove(car);
    }

    public void carList() {
        System.out.println(carsList);
    }

    public void sortByEngine(EngineType engine) {
        System.out.println(carsList.stream().filter(car -> car.getEngineType() == engine).toList());
    }

    public void sortByLowYear(int year) {
        System.out.println(carsList.stream().filter(car -> car.getYear() < year).toList());
    }

    public void sortByHeightYear(int year) {
        System.out.println(carsList.stream().filter(car -> car.getYear() > year).toList());
    }

    public void sortByLowPrice(int price) {
        System.out.println(carsList.stream().filter(car -> car.getPrice() < price).toList());
    }

    public void sortByHeightPrice(int price) {
        System.out.println(carsList.stream().filter(car -> car.getPrice() > price).toList());
    }


    public void sortCars(String parameter) {
        if (parameter.equals("ascending")) {
            System.out.println(carsList.stream().sorted(Comparator.comparing(Car::getName)).collect(Collectors.toList()));
        } else {
            System.out.println(carsList.stream().sorted(Comparator.comparing(Car::getName).reversed()).collect(Collectors.toList()));
        }
    }

    public void checkSpecificCar(String carName) {
        System.out.println(carsList.stream().filter(car -> car.getName() == carName).toList());
    }

    public void sortByManufacturer(String manufacturer) {
        System.out.println(carsList.stream().filter(car -> car.getManufacturers().getName() == manufacturer).toList());
    }

    public void sortByManufacturerYear(int manufacturerYear, String compare) {
        if (compare.equals("<")) {
            System.out.println(carsList.stream().filter(car -> car.getManufacturers().getYear() < manufacturerYear).toList());
        } else if (compare.equals(">")) {
            System.out.println(carsList.stream().filter(car -> car.getManufacturers().getYear() > manufacturerYear).toList());
        } else if (compare.equals("<=")) {
            System.out.println(carsList.stream().filter(car -> car.getManufacturers().getYear() <= manufacturerYear).toList());
        } else if (compare.equals("<=")) {
            System.out.println(carsList.stream().filter(car -> car.getManufacturers().getYear() <= manufacturerYear).toList());
        } else if (compare.equals("=")) {
            System.out.println(carsList.stream().filter(car -> car.getManufacturers().getYear() == manufacturerYear).toList());
        } else if (compare.equals("!=")) {
            System.out.println(carsList.stream().filter(car -> car.getManufacturers().getYear() != manufacturerYear).toList());
        } else {
            System.out.println("Input information incorrect!");
        }


    }


}

