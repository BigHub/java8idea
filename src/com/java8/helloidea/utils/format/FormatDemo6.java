package com.java8.helloidea.utils.format;

import java.util.Calendar;
import java.util.Formatter;

/**
 * Use arguments indexes to simplify the
 * creation of a custom time and date format.
 * Created by jianwei on 16/7/11.
 */
public class FormatDemo6 {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();
        Calendar cal = Calendar.getInstance();

        fmt.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(fmt);
        fmt.close();
    }
}
