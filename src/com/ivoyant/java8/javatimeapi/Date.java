package com.ivoyant.java8.javatimeapi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
//        current date without time zone
        LocalDate today= LocalDate.now();
        System.out.println(today);

//        custome date
        LocalDate custom=LocalDate.of(2002,3,15);
        System.out.println(custom);

//        get the value
        int dayOfMonth = today.getDayOfMonth();
        Month month = today.getMonth();
        int year = today.getYear();
        System.out.println(dayOfMonth);
        System.out.println(month);
        System.out.println(year);

//         minus
        LocalDate yesterday = today.minusDays(1);
        System.out.println(yesterday);

        if(today.isAfter(yesterday)){
            System.out.println("Hi");
        }

        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalTime customtime=LocalTime.of(13,12,8);
        System.out.println(customtime);

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime parse=LocalDateTime.parse("2025-03-11T13:36");
        System.out.println(parse);

        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);

        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String format=LocalDate.now().format(dateTimeFormatter);
        System.out.println(format);


    }
}
