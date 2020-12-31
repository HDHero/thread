package com.remous.thread.chapeter01.threadPriority;

/**
 * @Author: Remous
 * @Date: 2020/12/31 16:45
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        System.out.println("myThread2 =" + this.getPriority());
    }
}
