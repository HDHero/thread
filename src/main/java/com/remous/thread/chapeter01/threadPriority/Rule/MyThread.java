package com.remous.thread.chapeter01.threadPriority.Rule;

import java.util.Random;

/**
 * @Author: Remous
 * @Date: 2020/12/31 16:54
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();

        long result = 0;
        for (int i = 0; i < 10; ++i) {
            for (int j =0 ; j<50000; ++j) {
                Random random = new Random();
                int ra = random.nextInt();
                result += ra;
            }
        }
        long endTime = System.currentTimeMillis();

        System.out.println("线程1耗时为： " + (endTime - startTime));
    }
}
