package com.remous.thread.chapeter02.synchronizedThread.TestThread;

/**
 * @Author: Remous
 * @Date: 2021/1/22 11:11
 * @ Nothing is impossible to a willing heart.
 */
public class Client {
    public static void main(String[] args) {

        SellThreadA sellThreadA = new SellThreadA();

        Thread thread1 = new Thread(sellThreadA);

        Thread thread2 = new Thread(sellThreadA);

//        for (int i = 0; i < 10; i++) {
//            Thread thread1 = new Thread(sellThreadA);
//            thread1.start();
//        }
        thread1.start();

        thread2.start();

        //System.out.println("金额还剩:" + sellThreadA.balance);

    }

}
