package com.remous.thread.chapeter01.stopThread.interruptThread;

import com.remous.thread.chapeter02.unsafe.TreadB;

/**
 * @Author: Remous
 * @Date: 2021/1/6 20:49
 * @ Nothing is impossible to a willing heart.
 */
public class CannotInterrupt {

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            int num = 0;
            //try {
            while (num <= 10000 && ! Thread.currentThread().isInterrupted()) {
                if (num % 100 == 0) {
                    System.out.println("是100的倍数" + num);
                }
                num++;
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //}
        };

        Thread thread = new Thread(runnable);
        thread.start();

        Thread.sleep(5000);
        thread.interrupt();
        //thread.isInterrupted();
    }
}
