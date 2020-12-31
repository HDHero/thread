package com.remous.thread.chapeter01.yield;

/**
 * @Author: Remous
 * @Date: 2020/12/31 16:22
 * @ Nothing is impossible to a willing heart.
 */

/**
 * yield 方法的作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间，当放弃时间不确定、有可能刚刚放弃，马上又获得CPU时间片
 *
 * 不使用yield  用时：6毫秒！
 * 使用yield    用时：336毫秒，将CPU让给其他资源导致速度变慢
 *
 */
public class YieldReturn {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        myThread.start();
    }
}
