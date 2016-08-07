package com.java8.helloidea.stream;

import java.util.ArrayList;

/**
 * Demonstrate the use of a combiner with reduce()
 *
 * Created by jianwei on 2016/8/6.
 */
class StreamDemo3 {

    public static void main(String[] args) {

        // This is now a list of double values.
        ArrayList<Double> myList = new ArrayList<>( );

        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);
//以下程序在idea中用jdk1.8编译不过, 用系统上安装的java8编译也编译不过, 但在eclipse中可以编译通过。
//        double productOfSqrRoots = myList.parallelStream().reduce(
//                1.0,
//                (a,b) -> a * Math.sqrt(b),
//                (a,b) -> a * b
//        );
//
//        System.out.println("Product of square roots: " + productOfSqrRoots);
    }
}