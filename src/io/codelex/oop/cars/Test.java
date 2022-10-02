package io.codelex.oop.cars;

import static io.codelex.oop.cars.EngineType.*;

public class Test {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Audi Group", 1972, "Germany");
        Car car1 = new Car("Audi", "A4", V12, 4000, 2006, manufacturer1);
        Manufacturer manufacturer2 = new Manufacturer("PSA Group", 1976, "Paris");
        Car car2 = new Car("Peugeot", "306", S4, 5000, 2018, manufacturer2);
        Manufacturer manufacturer3 = new Manufacturer("Stelantis", 1929, "Germany");
        Car car3 = new Car("Opel", "Corsa", S3, 8000, 2020, manufacturer2);
        Manufacturer manufacturer4 = new Manufacturer("Bayerische Motoren Werke AG", 1916, "Germany");
        Car car4 = new Car("BMW", "328", S6, 2000, 1998, manufacturer4);
        Manufacturer manufacturer5 = new Manufacturer("Mercedes-Benz Group AG", 1926, "Germany");
        Car car5 = new Car("Mercedes", "S500", V12, 3500, 1996, manufacturer5);
        Car car6 = new Car("Audi", "A6", V6, 2500, 2002, manufacturer1);
        Car car7 = new Car("Audi", "A8", V12, 6000, 2008, manufacturer1);


        System.out.println(manufacturer1.getName());
        System.out.println(car1.getModel());
        manufacturer2.setCountry("England");
        car2.setModel("406");

        CarService service = new CarService();
        service.addCar(car1);
        service.addCar(car2);
        service.addCar(car3);
        service.addCar(car4);
        service.addCar(car5);
        service.addCar(car6);
        service.addCar(car7);
        service.removeCar(car2);
        service.carList();
        service.sortByEngine(V12);
        service.sortByLowYear(1999);
        service.sortByHeightYear(1999);
        service.sortByLowPrice(4500);
        service.sortByHeightPrice(4500);
        service.sortCars("ascending");
        service.sortCars("descending");
        service.checkSpecificCar("Mercedes");
        service.sortByManufacturer("PSA Group");
        service.sortByManufacturerYear(1920, ">");
        service.sortByManufacturerYear(1972, "<=");
    }
}
