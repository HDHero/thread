package com.remous.thread.chapeter01.isAlive;

/**
 * @Author: Remous
 * @Date: 2020/11/18 10:14
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("线程 run ="+this.isAlive() );
    }
}
