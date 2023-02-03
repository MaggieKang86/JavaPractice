package com.sample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.JapaneseDate;
import java.time.chrono.MinguoDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainClass {

    public static void main(String[] args) {

        LocalDate myDate = LocalDate.now();
        System.out.println("myDate：" + myDate);

        LocalTime myTime = LocalTime.now();
        System.out.println("myTime：" + myTime);

        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime：" + myDateTime);  // ISO 8601 YYYY-MM-ddTHH:mm:ss.s
        System.out.println("------------");
        System.out.println("日期：" + myDateTime.format(DateTimeFormatter.ISO_DATE));
        System.out.println("時間：" + myDateTime.format(DateTimeFormatter.ISO_TIME));
        System.out.println("日期時間：" + myDateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("");
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("");
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("");
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG)));
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        System.out.println(myDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));
        System.out.println("------------------");

        // 建立
        LocalDate date1 = LocalDate.of(2023, 1, 5);
        System.out.println("date1：" + date1);

        LocalDate date2 = LocalDate.of(2023, Month.JANUARY, 9);
        System.out.println("date2：" + date2);

        LocalDate date3 = LocalDate.parse("2023-01-20");  // YYYY-MM-DD
        System.out.println("date3：" + date3);
        System.out.println("------------------");

        System.out.println("myDate：" + myDate);
        System.out.println("isAfter(2023-01-05)：" + myDate.isAfter(date1));
        System.out.println("isAfter(2023-01-20)：" + myDate.isAfter(date3));
        System.out.println("------------------");

        System.out.println("isBefore(2023-01-05)：" + myDate.isBefore(date1));
        System.out.println("isBefore(2023-01-20)：" + myDate.isBefore(date3));
        System.out.println("------------------");

        System.out.println("isEqual(2023-01-05)：" + myDate.isEqual(date1));
        System.out.println("isEqual(2023-01-09)：" + myDate.isEqual(date2));
        System.out.println("isEqual(2023-01-20)：" + myDate.isEqual(date3));
        System.out.println("------------------");

        System.out.println("isLeapYear()：" + myDate.isLeapYear());
        System.out.println("getYear()：" + myDate.getYear());
        System.out.println("getMonth()：" + myDate.getMonth());
        System.out.println("getDayOfMonth()：" + myDate.getDayOfMonth());
        System.out.println("getDayOfWeek()：" + myDate.getDayOfWeek());
        System.out.println("getDayOfYear()：" + myDate.getDayOfYear());
        System.out.println("------------------");

        // 計算
        System.out.println(myDate.plusMonths(1).plusWeeks(3).minusDays(2));

        // 民國年
        MinguoDate minguoDate = MinguoDate.now();
        System.out.println("minguoDate：" + minguoDate);
        JapaneseDate japaneseDate = JapaneseDate.now();
        System.out.println("japaneseDate" + japaneseDate);
    }


}
