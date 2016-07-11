package com.java8.helloidea.utils.format;

import java.util.Formatter;

/**
 * Demonstrate the space format specifiers.
 * Created by jianwei on 16/7/11.
 */
public class FormatDemo5 {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        fmt.format("%d", -100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("% d", 100);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%(d", -200);//使用括号显示负数
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%+d", 200);
        System.out.println(fmt);
        fmt.close();

        fmt = new Formatter();
        fmt.format("%,.2f", 2342480802.34);//,是组分隔符便于阅读 如:100,000,111,000.11
        System.out.println(fmt);
        fmt.close();
    }
}
