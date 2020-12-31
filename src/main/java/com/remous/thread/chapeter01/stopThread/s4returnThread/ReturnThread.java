package com.remous.thread.chapeter01.stopThread.s4returnThread;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:31
 * @ Nothing is impossible to a willing heart.
 */
public class ReturnThread extends Thread {

    private String name;

    public ReturnThread (String name) {

        this.name = name;
    }
    @Override
    public void run() {

        while (true) {
            if (currentThread().isInterrupted()) {
                System.out.println("中断线程" + currentThread().getName());
                return;
            }
            System.out.println("timer= " + System.currentTimeMillis());
        }
    }
}
