package com.java8.helloidea.utils;

import java.util.Currency;
import java.util.Locale;

/**
 * Demonstrate Currency.
 * Created by jianwei on 16/7/10.
 */
public class CurDemo {
    public static void main(String args[]) {
        Currency c;

        c = Currency.getInstance(Locale.CHINA);

        System.out.println("Symbol: " + c.getSymbol());
        System.out.println("Default fractional digits: " +
                c.getDefaultFractionDigits());
    }
}
