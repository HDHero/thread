package com.remous.thread.chapeter01.resume.disadvantage;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:52
 * @ Nothing is impossible to a willing heart.
 */
public class SynchronizedObj {

    synchronized public void printString() {
        System.out.println("begin");
        if (Thread.currentThread().getName().equals("thread")) {
            System.out.println("a线程永远suspend了！");
            Thread.currentThread().suspend();
        }
        System.out.println("end");
    }
}
