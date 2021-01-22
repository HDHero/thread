package com.remous.thread.chapeter02.unsafe;


/**
 * @Author: Remous
 * @Date: 2021/1/5 23:24
 * @ Nothing is impossible to a willing heart.
 */
public class TreadB extends Thread {

    private HaseSelfPrivateNum hasSelfPrivateNum;

    public TreadB(HaseSelfPrivateNum hasSelfPrivateNum) {
        this.hasSelfPrivateNum = hasSelfPrivateNum;
    }

    @Override
    public void run() {
        try {
            hasSelfPrivateNum.addI("b");
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        super.run();
    }
}
