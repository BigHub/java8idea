package com.java8.helloidea.io.nio;

import java.io.IOException;
import java.nio.file.*;

/**
 * Copy a file using NIO. Requires JDK 7 or later.
 * Created by jianwei on 16/7/17.
 */
public class NIOCopy {
    public static void main(String args[]) {

        if(args.length != 2) {
            System.out.println("Usage: Copy from to");
            return;
        }

        try {
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);

            // Copy the file.
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);

        } catch(InvalidPathException e) {
            System.out.println("Path Error " + e);
        } catch (IOException e) {
            System.out.println("I/O Error " + e);
        }
    }
}
