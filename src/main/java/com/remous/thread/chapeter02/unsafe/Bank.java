package com.remous.thread.chapeter02.unsafe;

/**
 * @Author: Remous
 * @Date: 2021/4/21 10:20
 * @ Nothing is impossible to a willing heart.
 */
public class Bank implements Runnable {
    static int cash = 0;


    @Override
    public void run() {
        for (int i =0; i< 10000; ++i) {
            ++cash;
        }
        System.out.println("current Thread is " + Thread.currentThread().getName() +
                "the cash s =" + cash);
    }
}
