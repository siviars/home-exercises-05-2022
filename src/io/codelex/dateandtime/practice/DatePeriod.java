package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {

    boolean test = false;
    LocalDate start, startResult;
    LocalDate end, endResult;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod name) {
        if (checkPeriod(name)) {
            if (name.start.isBefore(start)) {
                startResult = start;
                endResult = name.end;
                return new DatePeriod(startResult, endResult);
            } else {
                startResult = name.start;
                endResult = end;
                return new DatePeriod(startResult, endResult);
            }
        } else {
            return null;
        }
    }

    public boolean checkPeriod(DatePeriod name) {
        if (start.isBefore(name.end) && end.isAfter(name.start)) {
            test = true;
        } else {
            test = false;
        }
        return test;
    }
}
