package com.remous.thread.chapeter01.stopThread;

/**
 * @Author: Remous
 * @Date: 2020/11/18 16:14
 * @ Nothing is impossible to a willing heart.
 */

import java.util.Calendar;

/**
 * interrupt 方法的使用效果并不想for+break语句那样，马上就停止循环。
 * 调用interrupt()方法仅仅是在当前线程打了一个停止的标记，并不是真正的停止线程
 */
public class RunMyThread {
    public static void main(String[] args) {
        //下面程序调用interrupt方法并没有停止线程，那么如何停止线程了？见02
         try {
             MyThread myThread = new MyThread();
             myThread.start();
             Thread.sleep(2000);
             myThread.interrupt();
         }
         catch (InterruptedException e){
             System.out.println("main catch");
             e.printStackTrace();
         }
    }
}
