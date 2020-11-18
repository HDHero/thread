package com.remous.thread.数据共享.syncProj;

/**
 * @Author: Remous
 * @Date: 2020/11/18 9:40
 * @ Nothing is impossible to a willing heart.
 */
public class TestSafeSale {

    public static void main(String[] args) {
        SafeSale mythread=new SafeSale();

        Thread t1=new Thread(mythread,"A1");

        Thread t2=new Thread(mythread,"A2");

        Thread t3=new Thread(mythread,"A3");

        Thread t4=new Thread(mythread,"A4");

        Thread t5=new Thread(mythread,"A5");

        t1.start();

        t2.start();

        t3.start();

        t4.start();

        t5.start();




    }
}
