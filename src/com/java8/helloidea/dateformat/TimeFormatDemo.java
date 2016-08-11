package com.java8.helloidea.dateformat;

// Demonstrate time formats.
import java.text.*;
import java.util.*;
public class TimeFormatDemo {
    public static void main(String args[]) {
        Date date = new Date();
        DateFormat df;

        df = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + df.format(date));

        df = DateFormat.getTimeInstance(DateFormat.LONG, Locale.UK);
        System.out.println("United Kingdom: " + df.format(date));

        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CANADA);
        System.out.println("Canada: " + df.format(date));

        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINA);
        System.out.println("China: " + df.format(date));

        df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.CHINESE);
        System.out.println("Chinese: " + df.format(date));

        df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.CHINA);
        System.out.println("Chinese date time :" + df.format(date));
    }
}