package com.remous.thread.chapeter01.resume;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:43
 * @ Nothing is impossible to a willing heart.
 */
public class ResumeThread  extends Thread{

    private long i = 0;

    public long getI() {
        return i;
    }

    public void setI(long i) {
        this.i = i;
    }

    @Override
    public void run () {
        while (true) {
            ++i;
        }
    }
}
