package com.javarush.demo;

import java.util.Date;

public class SimpleDateFormatDemo {

    public static void main(String[] args) {

        int base = 1900;
        int startYear = 119;
        Date date  = new Date(startYear, 1, 21, 14, 1, 34);
        System.out.println(date); // Thu Feb 21 14:01:34 YEKT 2019

        // Перебрать диапазон
        for (int i = 1; i < 5; i++) {
            date.setYear(startYear + i);
            System.out.println("Год: " + (base + date.getYear()));
            // Перебор по месяцам

        }


    }

}
