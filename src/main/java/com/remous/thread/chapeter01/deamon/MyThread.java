package com.remous.thread.chapeter01.deamon;

/**
 * @Author: Remous
 * @Date: 2020/12/31 17:14
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {
        try {
            while (true) {
                ++i;
                System.out.println("i = " + i);
                Thread.sleep(500);
            }

        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
