package com.remous.thread.chapeter02.synchronizedThread;

/**
 * @Author: Remous
 * @Date: 2020/12/31 17:58
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 非线程安全问题其实会在多个线程对同一个对象中的实例变量进行并发访问时发生，
 * 产生的后果就是"脏读"，此方法内部的变量是私有的，所以就是线程安全的
 */
public class RunHasSelf {

    public static void main(String[] args) {
        HasSelfPrivateNum num = new HasSelfPrivateNum();

        ThreadA threadA = new ThreadA(num);

        ThreadB threadB = new ThreadB(num);

        threadA.start();

        threadB.start();

    }
}
