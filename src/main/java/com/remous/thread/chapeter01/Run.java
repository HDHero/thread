package com.remous.thread.chapeter01;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:04
 * @working hard
 *
 * 启动3个线程，count变量数据没有共享
 */

public class Run {
    public static void main(String[] args) {
        MyThread a1=new MyThread("A");

        MyThread a2=new MyThread("B");

        MyThread a3=new MyThread("C");

        a1.start();

        a2.start();

        a3.start();

    }
}
