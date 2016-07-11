package com.java8.helloidea.utils.format;

import java.util.Formatter;

/**
 * Demonstrate a field-width specifier.
 * Created by jianwei on 16/7/11.
 */
public class FormatDemo4 {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        fmt.format("|%12f|%n|%12f|%n|%012f|",
                10.12345, 10.12345, 10.12345);

        System.out.println(fmt);

        fmt.close();
    }
}
