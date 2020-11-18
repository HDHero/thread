package com.remous.thread.chapeter01.syncProj;

/**
 * @Author: Remous
 * @Date: 2020/11/18 9:40
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 使用synchronize，就不会出现一样的情况，使多个线程在执行run方法时，
 * 以排队的方式进行处理。当一个线程调用run前，就会先判断run方法有没有被上锁，
 * 如果上锁，说明其他线程正在调用run方法，必须要等待其他线程对run方法调用结束后才可以执行run方法
 *
 */

/**
 * Synchronized：可以在任意对象及方法上加锁，而加锁的这段代码称为"互斥区"和"临界区"
 */

/**
 * 当一个线程想要执行同步方法里面的代码时，线程首先尝试去拿这把锁，如果能拿到这把锁，那么这个线程就
 * 可以执行synchronize里面的代码。如果拿不到这把锁，那么这个线程就会不断地尝试拿这把锁，直到能够拿到为止，
 * 而且是多个线程同时去争抢这把锁
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
