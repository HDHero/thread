package com.remous.thread.chapeter02.synchronizedThread;

/**
 * @Author: Remous
 * @Date: 2020/12/31 17:57
 * @ Nothing is impossible to a willing heart.
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadB (HasSelfPrivateNum numRef) {
        this.hasSelfPrivateNum = numRef;
    }

    @Override
    public void run() {
        super.run();
        try {
            hasSelfPrivateNum.addI("b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
