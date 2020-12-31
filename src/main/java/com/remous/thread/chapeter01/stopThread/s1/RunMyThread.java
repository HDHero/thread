package com.remous.thread.chapeter01.stopThread.s1;

/**
 * @Author: Remous
 * @Date: 2020/11/18 16:29
 * @ Nothing is impossible to a willing heart.
 */

/**
 * ininterrupted
 * 来判断thread对象锁代表的线程是否停止，但从结果来看，线程并未停止。
 * 这也就证明了interruptd()方法的解释： 测试当前线程是否已经中断。
 * 这个"当前线程是main" 它从未中断过，所以打印2个false
 */
public class RunMyThread {


    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            //Thread.currentThread().interrupt();
            System.out.println("是否停止1?  = " + thread.interrupted());
            System.out.println("是否停止2？ = " + thread.interrupted());
        }
        catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
