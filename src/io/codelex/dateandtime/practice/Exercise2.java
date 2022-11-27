package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    private static LocalDate formatDate;
    private static int year;
    private static String mon, date;

    public static void main(String[] args) {
        DateTimeFormatter dateFormatter1 = DateTimeFormatter.ISO_LOCAL_DATE;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter server launch day yyyy-mm-dd:");
        date = in.nextLine();
        formatDate = LocalDate.parse(date, dateFormatter1);
        System.out.println("Enter given year:");
        year = in.nextInt();
        in.nextLine();
        System.out.println("Enter given month:");
        mon = in.nextLine().toUpperCase();
        if(Arrays.stream(Month.values()).anyMatch(m->String.valueOf(m).equals(mon))){
            calculateDays();
        }else{
            System.out.println("Wrong month!");
        }

    }

    private static void calculateDays() {
        LocalDate setDate = LocalDate.of(year, Month.valueOf(mon).getValue(), Month.valueOf(mon).length(false));
        System.out.println("You must update server :");
        while (formatDate.isBefore(setDate)) {
            formatDate = formatDate.plusDays(14);
            if (Month.of(formatDate.getMonthValue()) == Month.valueOf(mon) && formatDate.getYear() == year) {
                System.out.println(formatDate);
            }
        }
    }


}
