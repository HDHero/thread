package com.remous.thread.chapeter01.stopThread.s1;

/**
 * @Author: Remous
 * @Date: 2020/11/18 17:09
 * @ Nothing is impossible to a willing heart.
 */

/**
 * this.interrupted()和this.isInterrupted()的区别
 * 1. this.interrupted() 测试当前线程是否是中断状态，执行后具有将状态标志清除为false功能
 * 2. this.isInterrupted() 测试线程Thread对象是否已经是中断状态，但不清楚状态标志
 *
 */
public class IsInterrupt {
    public static void main(String[] args) {
        //方法isInterrupted()并未清除状态标志，所以打印了两个true
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1？ =" +thread.isInterrupted());
            System.out.println("是否停止2？ =" +thread.isInterrupted());
        }
        catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }

}
