package com.javarush.demo;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateNowDemo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ENGLISH); // ДД/ММ/ГГГГ
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/Helsinki"));

        Date current = new Date();
        System.out.println("Сейчас прошло мс с 1970: " + current.getTime()); // Сейчас прошло мс с 1970: 1792513169118

        Date slideMoment = new Date(1792512915427L);
        System.out.println("slideMoment: " + slideMoment); // Tue Oct 20 19:15:15 EEST 2026

    }

}
