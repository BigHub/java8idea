package com.java8.helloidea.utils.format;

import java.util.Formatter;

/**
 * Create a table of squares and cubes.
 * Created by jianwei on 16/7/11.
 */
public class FieldWidthDemo {
    public static void main(String args[]) {
        Formatter fmt;

        for(int i=1; i <= 10; i++) {
            fmt = new Formatter();

            fmt.format("%6d %6d %6d", i, i*i, i*i*i);
            System.out.println(fmt);
            fmt.close();
        }
    }
}
