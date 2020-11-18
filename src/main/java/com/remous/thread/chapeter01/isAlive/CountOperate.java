package com.remous.thread.chapeter01.isAlive;

/**
 * @Author: Remous
 * @Date: 2020/11/18 10:47
 * @ Nothing is impossible to a willing heart.
 */
public class CountOperate extends Thread {
    public CountOperate(){
        System.out.println("CountOpearte--begin");
        System.out.println("Thread.currentThread.getName()="+Thread.currentThread().getName());
        System.out.println("Thread.currentThread.isAlive()="+Thread.currentThread().isAlive());

        System.out.println("this.getName()=" + this.getName());
        System.out.println("this.isAlvie()=" + this.isAlive());
        System.out.println("CountOpearte--end");
    }

    @Override
    public void run() {
        super.run();
        System.out.println("run ---begin");
        System.out.println("run Thread.currentThread().getName()=" + Thread.currentThread().getName());
        System.out.println("run Thread.currentThread().isAlive()=" + Thread.currentThread().isAlive());

        System.out.println("run this.getName()=" + this.getName());
        System.out.println("run this.isAlive()= " + this.isAlive());
    }
}
