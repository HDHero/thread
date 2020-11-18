package com.remous.thread.chapeter01.currentThread;

/**
 * @Author: Remous
 * @Date: 2020/11/18 10:07
 * @ Nothing is impossible to a willing heart.
 */
public class MyCurrentThread {
    public static void main(String[] args) {
        testCurrentMethod();
    }

    /**
     * currentThread()方法可返回代码正在被哪个线程调用的信息
     */
    private static void testCurrentMethod() {
        System.out.println(Thread.currentThread().getName());
    }


}
