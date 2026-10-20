package com.javarush.demo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Сколько дней до дня рождения
 */
public class DaysToBirthdayDemo {

    static long daysToBirthday(LocalDate birthday, LocalDate toDay) {
        LocalDate next = birthday.withYear(toDay.getYear());
        if (next.isBefore(toDay)) {
            next = birthday.withYear(toDay.getYear() + 1);
        }
        return ChronoUnit.DAYS.between(toDay, next);
    }

    public static void main(String[] args) {

        LocalDate birthday = LocalDate.of(1990, 12, 31);

        LocalDate toDay = LocalDate.of(2026, 10, 20);

        System.out.println(daysToBirthday(birthday, toDay));
    }

}
