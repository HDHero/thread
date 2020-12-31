package com.remous.thread.chapeter01.stopThread;

/**
 * @Author: Remous
 * @Date: 2020/11/18 15:47
 * @ Nothing is impossible to a willing heart.
 */

/**
 *  停止一个线程可以使用Thread.stop()方法，但最好不用它。虽然它确实能停止一个正在运行的线程。但这个是不安全的
 *  java中有以下3种方法可以终止正在运行的线程
 *  1） 使用退出标志，使线程正常退出，也就是当run方法完成后线程终止
 *  2） 使用stop方法强行终止线程，但不推荐使用，因为和suspend即resume一样，都是作废的
 *  3） 使用interrupt方法中断线程
 *
 */
public class MyThread extends Thread{

    @Override
    public void run() {

        super.run();

        for( int i =0;i<500000;i++){
            System.out.println("i= " + (i + 1));
        }
    }
}
