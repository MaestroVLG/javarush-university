package com.javarush.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {

    public static void main(String[] args) {

        LocalDateTime moment = LocalDateTime.of(2019, 2, 23, 9, 5, 3);
        System.out.println(moment); // 2019-02-23T09:05:03

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        System.out.println(dtf.format(moment)); // 23.02.2019 09:05:03

        System.out.println(DateTimeFormatter.ofPattern("dd.MM.yyyy").format(moment)); // 23.02.2019

    }

}
