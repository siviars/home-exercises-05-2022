package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person {

    private String position;
    private LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    @Override
    public String getInfo() {
        return getFirstName() + " " + getFirstName() + " " + position + " work experience " + getWorkExperience() + " years";
    }

    public int getWorkExperience() {
        LocalDate now = LocalDate.now();
        return now.getYear() - startedWorking.getYear();
    }

}

