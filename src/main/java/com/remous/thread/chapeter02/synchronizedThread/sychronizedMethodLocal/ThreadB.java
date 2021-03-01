package com.remous.thread.chapeter02.synchronizedThread.sychronizedMethodLocal;

/**
 * @Author: Remous
 * @Date: 2021/2/26 20:07
 * @ Nothing is impossible to a willing heart.
 */
public class ThreadB extends Thread {

    private  MyObject object;

    public ThreadB(MyObject object) {
        super();
        this.object = object;
    }

    @Override
    public void run() {
        object.methodB();
    }
}
