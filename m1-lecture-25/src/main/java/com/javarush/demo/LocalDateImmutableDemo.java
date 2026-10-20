package com.javarush.demo;

import java.time.LocalDate;
import java.util.Locale;

public class LocalDateImmutableDemo {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2019, 2, 22);
        System.out.println(date); // 2019-02-22

        LocalDate later = date.plusDays(5)
                .minusDays(1);

        System.out.println(later); // 2019-02-26


    }

}
