package com.remous.thread.chapeter02.synchronizedThread.sychronizedMethodLocal;

import com.remous.thread.chapeter02.synchronizedThread.synchronizedObj.ThreadA;

/**
 * @Author: Remous
 * @Date: 2021/2/26 19:50
 * @ Nothing is impossible to a willing heart.
 */
public class MyObject {

    public synchronized void methodA() {
        try {
            System.out.println("methodA thread name: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodA end time:");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //public  void methodB() {
    public  synchronized void methodB() {

        try {
            System.out.println("methodB thread name: " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("methodB end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
