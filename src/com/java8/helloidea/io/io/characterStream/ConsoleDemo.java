package com.java8.helloidea.io.io.characterStream;

import java.io.Console;

/**
 * Demonstrate Console.
 *
 * Created by jianwei on 16/7/17.
 */
public class ConsoleDemo {
    public static void main(String args[]) {
        String str;
        Console con;

        // Obtain a reference to the console.
        con = System.console();
        // If no console available, exit.
        if(con == null) {
            System.out.println("Console is null!");
            return;
        }

        // Read a string and then display it.
        str = con.readLine("Enter a string: ");
        con.printf("Here is your string: %s\n", str);
    }
}
