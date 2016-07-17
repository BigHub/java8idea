package com.java8.helloidea.io.io.characterStream;

import java.io.FileReader;
import java.io.IOException;

/**
 * Demonstrate FileReader.
 * This program uses try-with-resources. It requires JDK 7 or later.
 * Created by jianwei on 16/7/17.
 */
public class FileReaderDemo {
    public static void main(String args[]) {
        //如果有中文会怎么样
        try ( FileReader fr = new FileReader("src/com/java8/helloidea/io/io/characterStream/FileReaderDemo.java") )
        {
            int c;

            // Read and display the file.
            while((c = fr.read()) != -1) System.out.print((char) c);

        } catch(IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
