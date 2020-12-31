package com.remous.thread.chapeter01.stopThread.stop;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:19
 * @ Nothing is impossible to a willing heart.
 */
public class MyThreadStop extends Thread {

    private SynchronizedObject synchronizedObject;

    public MyThreadStop(SynchronizedObject synchronizedObject) {
        super();
        this.synchronizedObject = synchronizedObject;
    }

    @Override
    public void run() {

        synchronizedObject.printString("b","bb");
    }
}
