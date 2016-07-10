package com.java8.helloidea.utils;

import java.util.Observable;
import java.util.Observer;

/**
 * An object may be observed by two or more observers.
 * Created by jianwei on 16/7/10.
 */
// This is the first observing class.
class Watcher1 implements Observer {
    public void update(Observable obj, Object arg) {
        System.out.println("update() called, count is " +
                arg);
    }
}

// This is the second observing class.
class Watcher2 implements Observer {
    public void update(Observable obj, Object arg) {
        // Ring bell when done
        if((Integer) arg == 0)
            System.out.println("Done" + '\7');
    }
}

// This is the class being observed.
class BeingWatched2 extends Observable {
    void counter(int period) {
        for( ; period >=0; period--) {
            setChanged();
            notifyObservers(period);
            try {
                Thread.sleep(100);
            } catch(InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }
    }
}

public class TwoObservers {
    public static void main(String args[]) {
        BeingWatched2 observed = new BeingWatched2();
        Watcher1 observing1 = new Watcher1();
        Watcher2 observing2 = new Watcher2();

        // add both observers
        observed.addObserver(observing1);
        observed.addObserver(observing2);

        observed.counter(10);
    }
}
