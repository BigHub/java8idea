package com.java8.helloidea.io.io;

import java.io.ByteArrayInputStream;

/**
 * Demonstrate ByteArrayInputStream.
 *
 * Created by jianwei on 16/7/14.
 */
public class ByteArrayInputStreamDemo {

    public static void main(String args[]) {
        String tmp = "abcdefghijklmnopqrstuvwxyz";
        byte b[] = tmp.getBytes();

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b,0,3);
    }

}
