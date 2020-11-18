package com.remous.thread.chapeter01.sleep06;

/**
 * @Author: Remous
 * @Date: 2020/11/18 12:00
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 由于main线程与MyThread2线程是异步执行的，所以首先打印的信息为begin和end，而MyThread2
 * 线程是随后运行的，在最后两行打印run begin 和 run end
 */
public class RunSleep {

    public static void main(String[] args) {
        MyThread2  myThread = new MyThread2();

        System.out.println("begin " + System.currentTimeMillis());

        myThread.start();

        System.out.println("end =" + System.currentTimeMillis());
    }
}
