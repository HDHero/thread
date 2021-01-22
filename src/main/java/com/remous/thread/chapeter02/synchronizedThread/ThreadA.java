package com.remous.thread.chapeter02.synchronizedThread;

/**
 * @Author: Remous
 * @Date: 2020/12/31 17:45
 * @ Nothing is impossible to a willing heart.
 */
public class ThreadA  extends Thread {

    private HasSelfPrivateNum hasSelfPrivateNum;

    public ThreadA (HasSelfPrivateNum numRef) {
        this.hasSelfPrivateNum = numRef;
    }

    @Override
    public void run() {
        super.run();
        try {
            hasSelfPrivateNum.addI("a");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
