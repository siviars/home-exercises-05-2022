package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercise1 {
    private static String first;
    private static String second;
    private static LocalDate firstDate;
    private static LocalDate secondDate;
    private static final int HOURS = 8;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first date dd/mm/yyyy: ");
        first = in.nextLine();
        firstDate = formatDate(first);

        System.out.println("Enter second date dd/mm/yyyy: ");
        second = in.nextLine();
        secondDate = formatDate(second);

        int workHours = (int) (firstDate.datesUntil(secondDate).filter(day -> day.getDayOfWeek().getValue() <= 5).count() * HOURS);
        System.out.println("Employee work " + workHours + " hours");

    }

    private static LocalDate formatDate(String date) {
        if (date.length() != 10 && date.charAt(2) != '/' && date.charAt(5) != '/') {
            System.out.println("Wrong dates entered!");
            return null;
        } else {
            return LocalDate.of(Integer.valueOf(date.substring(6, 10)), Integer.valueOf(date.substring(3, 5)), Integer.valueOf(date.substring(0, 2)));
        }
    }
}
