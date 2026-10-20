package com.javarush.demo;

import java.util.Date;

public class DateFieldsDemo {

    public static void main(String[] args) {

        Date date = new Date(119, 1, 21, 14, 1, 34);
        System.out.println(date); // Thu Feb 21 14:01:34 YEKT 2019

        System.out.println("getYear(): " + date.getYear()); // 119
        System.out.println("getMonth(): " + date.getMonth()); // Feb = 1
        System.out.println("getDay(): " + date.getDay()); // 4 день недели
        System.out.println("getDate(): " + date.getDate()); // 21

        date.setYear(125);
        System.out.println("getYear(): " + date.getYear()); // 125
    }

}
