package com.data_;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

public class Data1 {
    public static void main(String[] args) {
//        Data data = new Data();
//        System.out.println(data);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH)+1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format =dateTimeFormatter.format(now);
        System.out.println(format);

        Instant now1 = Instant.now();
        System.out.println(now1);
        Date from = Date.from(now1);
        Instant instant = from.toInstant();
        System.out.println(instant);



    }
}
