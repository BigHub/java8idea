package com.java8.helloidea.utils.format;

import java.util.Formatter;

/**
 * Demonstrate the %n and %% format specifiers. %n可以用\n代替
 * Created by jianwei on 16/7/11.
 */
public class FormatDemo3 {
    public static void main(String args[]) {
        Formatter fmt = new Formatter();

        fmt.format("Copying file%nTransfer is %d%% complete", 88);
        System.out.println(fmt);

        fmt.format("\r\nCopying file\nTransfer is %d%% complete", 88);
        System.out.println(fmt);


        fmt.close();
    }
}
