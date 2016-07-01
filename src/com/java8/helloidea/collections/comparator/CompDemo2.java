package com.java8.helloidea.collections.comparator;

import java.util.TreeSet;

/**
 * Created by jianwei on 16/6/30.
 *
 */
public class CompDemo2 {
    public static void main(String[] args) {
        // Pass a reversed comparator to TreeSet() via a
        // lambda expression.
        TreeSet<String> ts = new TreeSet<>(
                (aStr, bStr) -> aStr.compareTo(bStr));

        // Add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // Display the elements.
        for(String element : ts)
            System.out.print(element + " ");

        System.out.println();
    }
}
