package com.java8.helloidea;

import java.util.Properties;

/**
 *
 * Created by jianwei on 16/7/12.
 */
public class MyPlayground {
    public static void main(String[] args) {
        Properties pro = System.getProperties();
        pro.list(System.out);
    }
}
