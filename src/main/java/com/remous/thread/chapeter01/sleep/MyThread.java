package com.remous.thread.chapeter01.sleep;

/**
 * @Author: Remous
 * @Date: 2020/11/18 11:59
 * @ Nothing is impossible to a willing heart.
 */

/**
 * sleep方法的作用是在指定的毫秒数内让当前"正在执行的线程"休眠（暂停执行）。这个“正在执行的线程”
 * 是指this.currentThread 返回的线程
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            System.out.println("run threadName= " +this.currentThread().getName() + "begin");
            Thread.sleep(2000);
            System.out.println("run threadName= " + this.currentThread().getName() + "end");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
