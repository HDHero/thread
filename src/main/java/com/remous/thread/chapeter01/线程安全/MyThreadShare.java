package com.remous.thread.chapeter01.线程安全;

/**
 * @Author: Remous
 * @Date: 2020/11/17 11:49
 * @ Nothing is impossible to a willing heart.
 */

/***
 * 实现三个线程共同对一个count变量进行减法操作
 */
public class MyThreadShare extends Thread{

    private int count=5;

    @Override
    public void run() {
        super.run();
        //此次不用for循环，因为使用同步后其他线程就得不到运行的机会了
        //一直由一个线程进行减法运算
        System.out.println("由 "+this.currentThread().getName()+" 计算，count="+count);
        count--;
    }
}
