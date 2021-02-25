package com.remous.thread.chapeter02.synchronizedThread.synchronizedObj;

/**
 * @Author: Remous
 * @Date: 2021/1/22 13:55
 * @ Nothing is impossible to a willing heart.
 */
public class ThreadB extends Thread {

    private HasSelfNum hasSelfNum;

    public ThreadB(HasSelfNum hasSelfNum) {
        super();

        this.hasSelfNum = hasSelfNum;
    }

    @Override
    public void run() {
        hasSelfNum.addNum("b");
        super.run();

    }
}
