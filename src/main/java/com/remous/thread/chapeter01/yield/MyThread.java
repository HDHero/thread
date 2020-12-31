package com.remous.thread.chapeter01.yield;

import com.remous.thread.chapeter01.resume.disadvantage.SynchronizedObj;

/**
 * @Author: Remous
 * @Date: 2020/12/31 15:57
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread{

    @Override
    public void run() {

        long beginTime = System.currentTimeMillis();

        int count = 0;

        for (int i = 0; i < 500000; ++i) {

            Thread.yield();

            count = count + (i + 1);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("用时：" + (endTime - beginTime) + "毫秒！");
    }
}
