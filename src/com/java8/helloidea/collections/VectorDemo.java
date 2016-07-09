package com.java8.helloidea.collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/**
 * Created by jianwei on 16/7/9.
 *
 */
public class VectorDemo {
    public static void main(String args[]) {

        // initial size is 3, increment is 2
        Vector<Integer> v = new Vector<>(3, 2);

        System.out.println("Initial size: " + v.size());
        System.out.println("Initial capacity: " +
                v.capacity());

        v.addElement(1);
        v.addElement(2);
        v.addElement(3);
        v.addElement(4);

        System.out.println("Capacity after four additions: " +
                v.capacity());
        v.addElement(5);
        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(6);
        v.addElement(7);

        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(9);
        v.addElement(10);

        System.out.println("Current capacity: " +
                v.capacity());
        v.addElement(11);
        v.addElement(12);


        System.out.println("First element: " + v.firstElement());
        System.out.println("Last element: " + v.lastElement());

        if(v.contains(3))
            System.out.println("Vector contains 3.");

        System.out.println("使用Enumerate 迭代Vector.");
        // Enumerate the elements in the vector.
        Enumeration<Integer> vEnum = v.elements();
        System.out.println("\nElements in vector:");
        while(vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");
        System.out.println();

        System.out.println("使用Iterator 迭代Vector.");
        //Use an iterator to display contents
        Iterator<Integer> it = v.iterator();
        System.out.println("\nElements in vector:");
        while (it.hasNext())
            System.out.println(it.next() + " ");
        System.out.println();

        System.out.println("使用for each 迭代Vector.");
        for (Integer e : v) {
            System.out.println(e + " ");
        }

    }
}
