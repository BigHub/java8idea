package com.java8.helloidea.utils.resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

import static java.util.ResourceBundle.getBundle;

/**
 * Demonstrate a resource bundle.
 * Created by jianwei on 16/7/12.
 */
public class LRBDemo {
    public static void main(String args[]) {
        ResourceBundle rd = getBundle("com.java8.helloidea.utils.resourceBundle.SampleRB",Locale.ENGLISH);

        System.out.println("English version: ");
        System.out.println("String for Title key : " +
                rd.getString("title"));

        System.out.println("String for StopText key: " +
                rd.getString("StopText"));

        System.out.println("String for StartText key: " +
                rd.getString("StartText"));

        rd = getBundle("com.java8.helloidea.utils.resourceBundle.SampleRB", Locale.GERMAN);

        System.out.println("\nGerman version: ");
        System.out.println("String for Title key : " +
                rd.getString("title"));

        System.out.println("String for StopText key: " +
                rd.getString("StopText"));

        System.out.println("String for StartText key: " +
                rd.getString("StartText"));

        rd = getBundle("com.java8.helloidea.utils.resourceBundle.SampleRB");

        System.out.println("\n中文版本: ");
        System.out.println("String for Title key : " +
                rd.getString("title"));

        System.out.println("String for StopText key: " +
                rd.getString("StopText"));

        System.out.println("String for StartText key: " +
                rd.getString("StartText"));
    }
}
