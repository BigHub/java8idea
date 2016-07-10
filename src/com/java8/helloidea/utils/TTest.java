package com.java8.helloidea.utils;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Demonstrate Timer and TimerTask.
 * Created by jianwei on 16/7/10.
 */

class MyTimerTask extends TimerTask {
    static  int a = 0;
    public void run() {
        System.out.println("Timer task executed." + (++a));
    }
}

public class TTest {
    public static void main(String args[]) {
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();

    /* Set an initial delay of 1 second,
       then repeat every half second.
    */
        myTimer.schedule(myTask, 1000, 500);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException exc) {
            exc.printStackTrace();
        }

        myTimer.cancel();
    }
}
