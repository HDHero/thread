package com.remous.thread.chapeter01.getId05;

/**
 * @Author: Remous
 * @Date: 2020/11/18 15:33
 * @ Nothing is impossible to a willing heart.
 */
public class Test {

    public static void main(String[] args) {
        Thread thread = Thread.currentThread();

        System.out.println("thread name "+ thread.getName() + " thread id=" + thread.getId());
    }
}
