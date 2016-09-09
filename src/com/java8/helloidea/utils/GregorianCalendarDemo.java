package com.java8.helloidea.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Demonstrate GregorianCalendar
 * Created by jianwei on 16/7/10.
 */
public class GregorianCalendarDemo {
    public static void main(String args[]) throws ParseException {
//        String months[] = {
//                "Jan", "Feb", "Mar", "Apr",
//                "May", "Jun", "Jul", "Aug",
//                "Sep", "Oct", "Nov", "Dec"};
//        int year;
//
//        // Create a Gregorian calendar initialized
//        // with the current date and time in the
//        // default locale and timezone.
//        GregorianCalendar gcalendar = new GregorianCalendar();
//
//        // Display current time and date information.
//        System.out.print("Date: ");
//        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
//        System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
//        System.out.println(year = gcalendar.get(Calendar.YEAR));
//
//        System.out.print("Time: ");
//        System.out.print(gcalendar.get(Calendar.HOUR) + ":");
//        System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
//        System.out.println(gcalendar.get(Calendar.SECOND));
//
//        // Test if the current year is a leap year
//        if(gcalendar.isLeapYear(year)) {
//            System.out.println("The current year is a leap year");
//        }
//        else {
//            System.out.println("The current year is not a leap year");
//        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2016-02-29 12:00:00");
        Date d2 = sdf.parse("2016-03-01 12:00:00");

        System.out.println("当前月的天数: " + daysOfMouth(d));
        System.out.println("当前日期: " + sdf.format(d));
        System.out.println("加一个月后日期: " + sdf.format(dateAfterMonth(d,1)));
        System.out.println("加一定天数后的日期: " + sdf.format(dateAfterDays(d,1)));
        System.out.println("日期间的间隔: " + daysInterval(d , d2));
    }


    /**
     * 计算给定日期当月的总天数
     * @param date
     * @return 当月的总天数
     * @author:     LuoJianwei
     * @date:       09/09/2016 13:57
     */
    public static int daysOfMouth(Date date){
        GregorianCalendar gcalendar = new GregorianCalendar();
        gcalendar.setTime(date);
        return gcalendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }


    /**
     * 根据给定日期计算加上给定月数后的日期
     * @param date
     * @param monthNum
     * @return 加上给定月数后的新日期
     * @author:     LuoJianwei
     * @date:       09/09/2016 13:59
     */
    public static Date dateAfterMonth(Date date,int monthNum){
        monthNum = monthNum < 1 ? 1 : monthNum;
        GregorianCalendar gcalendar = new GregorianCalendar();
        gcalendar.setTime(date);
        gcalendar.add(Calendar.MONTH,monthNum);
        return gcalendar.getTime();
    }


    /**
     * 根据给定日期计算加上给定天数后的日期
     * @param date
     * @param dayNum
     * @return 加上给定天数后的新日期
     * @author:     LuoJianwei
     * @date:       09/09/2016 14:02
     */
    public static Date dateAfterDays(Date date, int dayNum){

        GregorianCalendar gcalendar = new GregorianCalendar();
        gcalendar.setTime(date);
        gcalendar.add(Calendar.DAY_OF_MONTH,dayNum);
        return gcalendar.getTime();

    }

    /**
     * 计算两个日期间间隔的天数
     * @param fromDate
     * @param toDate
     * @return
     * @author:     LuoJianwei
     * @date:       09/09/2016 14:03
     */
    public static long daysInterval(Date fromDate, Date toDate){

        GregorianCalendar from = new GregorianCalendar();
        from.setTime(fromDate);
        from.set(Calendar.HOUR_OF_DAY, 0);
        from.set(Calendar.MINUTE, 0);
        from.set(Calendar.SECOND, 0);
        from.set(Calendar.MILLISECOND, 0);

        GregorianCalendar to = new GregorianCalendar();
        to.setTime(toDate);
        to.set(Calendar.HOUR_OF_DAY, 0);
        to.set(Calendar.MINUTE, 0);
        to.set(Calendar.SECOND, 0);
        to.set(Calendar.MILLISECOND, 0);

        return (to.getTime().getTime()-from.getTime().getTime())/(24*60*60*1000);
    }
}
