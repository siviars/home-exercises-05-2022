package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class DatePeriod {

    private boolean test = false;
    private LocalDate start;
    private LocalDate startResult;
    private LocalDate end;
    private LocalDate endResult;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
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

    private boolean checkPeriod(DatePeriod name) {
        if (start.isBefore(name.end) && end.isAfter(name.start)) {
            test = true;
        } else {
            test = false;
        }
        return test;
    }
}
