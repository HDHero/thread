package com.remous.thread.chapeter02.synchronizedThread.synchronizedObj;

/**
 * @Author: Remous
 * @Date: 2021/1/22 13:49
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 注意的是synchronized锁的是对象，而不是方法
 * 两个线程同时访问一个没有同步的方法，呈非线程安全状态，若需要改进，则需要加上synchronized关键字
 */
public class SynchronizedObject {

    public static void main(String[] args) {
        HasSelfNum hasSelfNum = new HasSelfNum();

        //HasSelfNum hasSelfNum2 = new HasSelfNum();

        ThreadA threadA = new ThreadA(hasSelfNum);

        threadA.start();

        ThreadB threadB = new ThreadB(hasSelfNum);

        threadB.start();

    }
}
