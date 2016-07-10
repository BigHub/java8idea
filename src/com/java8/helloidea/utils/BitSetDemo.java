package com.java8.helloidea.utils;

import java.util.BitSet;

/**
 * BitSet Demonstration.
 * Created by jianwei on 16/7/10.
 */
public class BitSetDemo {
    public static void main(String args[]) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        // set some bits
        for(int i=0; i<16; i++) {
            if((i%2) == 0) bits1.set(i);
            if((i%5) != 0) bits2.set(i);
        }

        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\nInitial pattern in bits2: ");
        System.out.println(bits2);

        // AND bits
        bits2.and(bits1);
        System.out.println("\nbits2 AND bits1: ");
        System.out.println(bits2);

        // OR bits
        bits2.or(bits1);
        System.out.println("\nbits2 OR bits1: ");
        System.out.println(bits2);

        // XOR bits
        bits2.xor(bits1);
        System.out.println("\nbits2 XOR bits1: ");
        System.out.println(bits2);

        BitSet bits3 = new BitSet(5);
        BitSet bits4 = new BitSet(5);
        bits3.set(1);
        bits3.set(2);
        bits3.set(3);
        bits3.set(4);
        bits3.set(5);
        bits3.set(9);
        bits3.set(10);
        bits4.set(6);
        bits4.set(7);
        System.out.println("bits3 and bits4:");
        System.out.println(bits3);
        System.out.println(bits4);
        System.out.println("bit3 xor bits4:");
        bits3.xor(bits4);
        System.out.println(bits3);
    }
}
