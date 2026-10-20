package com.javarush.demo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarCreateDemo {

    public static void main(String[] args) {

        Calendar now = Calendar.getInstance();
        System.out.println(now.getClass().getSimpleName()); // GregorianCalendar

        Calendar calendar = new GregorianCalendar(2019,
                Calendar.FEBRUARY,
                21,
                14,
                1,
                34);

        System.out.println(calendar.getTime()); // Thu Feb 21 14:01:34 YEKT 2019
        System.out.println(calendar.get(Calendar.ERA)); // 1
        System.out.println(calendar.get(Calendar.YEAR)); // 2019
        System.out.println(calendar.get(Calendar.MONTH)); // 1 = Feb
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH)); // 21
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK)); // 5 - четверг

    }

}
