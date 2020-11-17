package com.remous.thread.数据共享;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:14
 * @working hard
 */
public class RunMySynThread {
    public static void main(String[] args) {
        MySynThread mySynThread=new MySynThread();

        Thread t1=new Thread(mySynThread);

        Thread t2=new Thread(mySynThread);

        Thread t3=new Thread(mySynThread);


        Thread t4=new Thread(mySynThread);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
