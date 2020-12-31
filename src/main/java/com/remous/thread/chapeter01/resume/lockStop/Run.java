package com.remous.thread.chapeter01.resume.lockStop;

/**
 * @Author: Remous
 * @Date: 2020/12/31 15:04
 * @ Nothing is impossible to a willing heart.
 */
public class Run {

    public static void main(String[] args) throws InterruptedException{

        MyThread thread = new MyThread();

        thread.start();

        Thread.sleep(1000);

        thread.suspend();

        System.out.println("main suspend");

    }
}
