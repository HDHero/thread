package com.remous.thread.chapeter01.threadPriority;

/**
 * @Author: Remous
 * @Date: 2020/12/31 16:35
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        System.out.println("mythread run priority = " + this.getPriority());

        MyThread2 myThread2 = new MyThread2();

        myThread2.start();

    }
}
