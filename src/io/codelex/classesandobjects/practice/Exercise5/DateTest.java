package io.codelex.classesandobjects.practice.Exercise5;

public class DateTest {
    public static void main(String[] args) {
        Date date = new Date(26, 2, 2014);
        date.displayDate();
        date.setDay(12);
        date.setMonth(5);
        date.setYear(2019);
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }
}
