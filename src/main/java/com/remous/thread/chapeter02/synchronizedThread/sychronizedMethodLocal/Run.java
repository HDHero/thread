package com.remous.thread.chapeter02.synchronizedThread.sychronizedMethodLocal;

/**
 * @Author: Remous
 * @Date: 2021/2/26 19:50
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 查看到Lock锁对象的效果:
 * 第一种：对象A：MyObject methodA加上synchronized；methodB加上不加synchronized
 *       1.创建两个线程t1和t2，每个对象的持有对象A。A有两个方法一个Method。
 *       2.线程t1调用对象A中的methodA方法，线程t2调用对象A中的methodB方法。
 *       3.当调用同步方法A时，此时线程t1获得对象A的锁，此时线程t2可以调用对象A其他非synchronized方法
 * 第二种：对象A：MyObject methodA和methodB都加上synchronized;
 *       1.创建两个线程t1和t2，每个对象的持有对象A。A有两个方法一个Method。
 *       2.线程t1调用对象A中的methodA方法，线程t2调用对象A中的methodB方法。
 *       3.此时线程t1获得了对象A的锁，此时线程t2调用，此时线程t2调用对象的synchronized方法会等待。
 */
public class Run {

    public static void main(String[] args) {
        MyObject myObject = new MyObject();

        //MyObject myObject2 = new MyObject();

        ThreadA a = new ThreadA(myObject);
        a.setName("a");
        ThreadB b = new ThreadB(myObject);
        b.setName("b");
        a.start();
        b.start();
    }
}

