package com.remous.thread.chapeter01.线程安全;

/**
 * @Author: Remous
 * @Date: 2020/11/17 11:47
 * @ Nothing is impossible to a willing heart.
 */
public class MyThreadRun {

    public static void main(String[] args) {
        //数据不共享
        //runNotShare();

        //chapeter01
        runShare();
    }

    private static void runShare(){
        MyThreadShare m1=new MyThreadShare();
        Thread a=new Thread(m1,"A");
        Thread b=new Thread(m1,"B");
        Thread c=new Thread(m1,"C");

        a.start();

        b.start();

        c.start();

    }

    public static void runNotShare(){
        MyThreadNotShare m1=new MyThreadNotShare("A");

        MyThreadNotShare m2=new MyThreadNotShare("B");

        MyThreadNotShare m3=new MyThreadNotShare("C");

        m1.start();

        m2.start();

        m3.start();
    }
}
