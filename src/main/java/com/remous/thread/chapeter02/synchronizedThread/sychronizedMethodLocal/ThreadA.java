package com.remous.thread.chapeter02.synchronizedThread.sychronizedMethodLocal;

/**
 * @Author: Remous
 * @Date: 2021/2/26 20:05
 * @ Nothing is impossible to a willing heart.
 */
public class ThreadA extends Thread {

    private  MyObject object;

    public ThreadA(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.methodA();
    }
}
