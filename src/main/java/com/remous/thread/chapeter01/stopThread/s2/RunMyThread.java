package com.remous.thread.chapeter01.stopThread.s2;

/**
 * @Author: Remous
 * @Date: 2020/11/18 17:48
 * @ Nothing is impossible to a willing heart.
 */
public class RunMyThread {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(2000);
            thread.interrupt();
        }
        catch (InterruptedException e){
            System.out.println("main catch....");
            e.printStackTrace();
        }
        System.out.println("end....");
    }
}
