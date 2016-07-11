package com.java8.helloidea.utils.scanner;

import java.util.Scanner;

/**
 * Demonstrate findInLine().
 * Created by jianwei on 16/7/12.
 */
public class FindInLineDemo {
    public static void main(String args[]) {
        String instr = "Name: Tom Age: 28 ID: 77";

        Scanner conin = new Scanner(instr);

        // Find and display age.
        conin.findInLine("Age:"); // find Age

        if(conin.hasNext())
            System.out.println(conin.next());
        else
            System.out.println("Error!");

        conin.close();
    }
}
