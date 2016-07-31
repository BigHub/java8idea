package com.java8.helloidea.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * A simple example of Atomic.
 *
 * Created by jianwei on 16/7/31.
 */
class AtomicDemo {

    public static void main(String args[]) {
        new AtomThread("A");
        new AtomThread("B");
        new AtomThread("C");
    }
}

class Shared3 {
    static AtomicInteger ai = new AtomicInteger(0);
}

// A thread of execution that increments count.
class AtomThread implements Runnable {
    String name;

    AtomThread(String n) {
        name = n;
        new Thread(this).start();
    }

    public void run() {

        System.out.println("Starting " + name);

        for(int i=1; i <= 3; i++)
            System.out.println(name + " got: " +
                    Shared3.ai.getAndSet(i));
    }
}