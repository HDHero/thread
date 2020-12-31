package com.remous.thread.chapeter01.resume.disadvantage;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:54
 * @ Nothing is impossible to a willing heart.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException{

        final SynchronizedObj obj = new SynchronizedObj();

        Thread thread = new Thread(() -> {
            System.out.println("thread 已经启动了！");
            obj.printString();
        });

        thread.setName("thread");

        thread.start();

        Thread.sleep(1000);

        Thread thread2 = new Thread(() ->{
            System.out.println("thread2 已经启动了！");
            obj.printString();
        } );

        thread2.setName("thread2");

        thread2.start();
    }
}
