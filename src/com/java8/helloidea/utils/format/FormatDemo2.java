package com.java8.helloidea.utils.format;

import java.util.Formatter;

/**
 * Demonstrate the %f and %e format specifiers.
 * Created by jianwei on 16/7/11.
 */
public class FormatDemo2 {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        for(double i=1.23; i < 1.0e+6; i *= 100) {
            fmt.format("%f %e", i, i);
            System.out.println(fmt);
        }
        fmt.format("\r\nHex: %x, Octal: %o", 196, 196);
        System.out.println(fmt);
        fmt.format("\r\nHex:%a",512.0);
        System.out.println(fmt);
        fmt.close();
    }
}
