package com.remous.thread.chapeter01.threadPriority;

/**
 * @Author: Remous
 * @Date: 2020/12/31 16:49
 * @ Nothing is impossible to a willing heart.
 */
public class RunMyPriority {

    public static void main(String[] args) {

        System.out.println("main thread priority is " + Thread.currentThread().getPriority() + " | name  " + Thread.currentThread().getName() );

        MyThread myThread = new MyThread();

        myThread.setPriority(10);

        myThread.start();
    }
}
