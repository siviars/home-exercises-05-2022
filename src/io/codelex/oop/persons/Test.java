package io.codelex.oop.persons;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee("Tom", "Cruise", "EID10", 35, "Accountant", LocalDate.of(2020, 05, 06));
        Customer customer = new Customer("John", "Wick", "CID10", 28, "CID10-1", 5);

        System.out.println("Purchase count " + customer.getPurchaseCount());
        customer.setPurchaseCount(2);
        System.out.println("Purchase count " + customer.getPurchaseCount());
        System.out.println(customer.getInfo());

        System.out.println("Employee work experience " + employee.getWorkExperience());
        System.out.println(employee.getInfo());


    }
}
