package org.example.MeeshoInterview;

import java.util.Objects;

public class Date {

    private final int month;
    private final int day;
    private static final int DAYS_IN_MONTH = 30;

    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
    public int toDays() {
        return (month - 1) * DAYS_IN_MONTH + day;
    }

    public static Date fromDays(int days) {
        int month = days / DAYS_IN_MONTH + 1;
        int day = days % DAYS_IN_MONTH + 1;
        return new Date(month, day);
    }

    public int getDelta(Date other) {
        return Math.abs(this.toDays() - other.toDays()) + 1;
    }

    public Date addDays(int days) {
        int totalDays = this.toDays() + days;
        return Date.fromDays(totalDays);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Date date = (Date) obj;
        return month == date.month && day == date.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, day);
    }
}
