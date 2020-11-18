package com.remous.thread.chapeter01.sleep;

/**
 * @Author: Remous
 * @Date: 2020/11/18 14:20
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread2 extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("run threadName = "+this.currentThread().getName() +
                    " begin =" +System.currentTimeMillis());
            Thread.sleep(2000);
            System.out.println("run threadName = "+ this.currentThread().getName()+
                    " end = " + System.currentTimeMillis());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
