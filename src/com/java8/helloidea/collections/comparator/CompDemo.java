package com.java8.helloidea.collections.comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * Filename:    CompDemo.java
 * Description:
 * Copyright:   Copyright (c) 2015-2018 All Rights Reserved.
 * Company:     tzg.cn Inc.
 * @author:     jianwei
 * @version:    1.0
 * Create at:   16/6/30 22:14
 *
 */
class MyComp implements Comparator<String>{

    /**
     * @author:     jianwei   Create at: 16/6/30 22:25
     * @param aStr
     * @param bStr
     * @return
     */
    public int compare(String aStr, String bStr){

        //Reverse the comparison.
        return bStr.compareTo(aStr);
    }
}

public class CompDemo {
    public static void main(String[] args) {
        //Create a tree set
        TreeSet<String> ts = new TreeSet<>(new MyComp());

        //add elements to the tree set.
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");


        //Display the elements.
        for (String element : ts) {
            System.out.println(element + " ");
        }

        System.out.println();
    }

}
