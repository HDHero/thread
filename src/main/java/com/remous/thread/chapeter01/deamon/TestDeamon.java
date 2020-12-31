package com.remous.thread.chapeter01.deamon;

/**
 * @Author: Remous
 * @Date: 2020/12/31 17:16
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 当JVM中所有的线程都是守护线程的时候，JVM就可以退出了
 */
public class TestDeamon {

    public static void main(String[] args) throws InterruptedException{

        MyThread myThread = new MyThread();

        myThread.setDaemon(true);

        myThread.start();

        Thread.sleep(5000);

    }
}
