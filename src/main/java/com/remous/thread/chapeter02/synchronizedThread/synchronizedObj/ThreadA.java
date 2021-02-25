package com.remous.thread.chapeter02.synchronizedThread.synchronizedObj;

import com.remous.thread.chapeter02.unsafe.HaseSelfPrivateNum;

/**
 * @Author: Remous
 * @Date: 2021/1/22 13:53
 * @ Nothing is impossible to a willing heart.
 */
public class ThreadA extends Thread {

    private HasSelfNum hasSelfNum;

    public ThreadA(HasSelfNum hasSelfNum) {
        super();
        this.hasSelfNum = hasSelfNum;
    }

    @Override
    public void run() {
        hasSelfNum.addNum("a");
        super.run();

    }
}
