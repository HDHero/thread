package com.remous.thread.chapeter01.threadPriority.Rule;

/**
 * @Author: Remous
 * @Date: 2020/12/31 16:58
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 线程优先级1,5,10
 * priority 1: 221ms
 * priority 5: 119ms
 * priority 10: 90ms
 * 线程的优先级与运行结果的顺序无关，线程优先级和打印顺序具有不确定性
 */
public class RunMyCostThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        MyThread2 myThread2 = new MyThread2();

        MyThread3 myThread3 = new MyThread3();

        myThread.setPriority(1);

        myThread2.setPriority(5);

        myThread3.setPriority(10);

        myThread.start();

        myThread2.start();

        myThread3.start();
    }
}
