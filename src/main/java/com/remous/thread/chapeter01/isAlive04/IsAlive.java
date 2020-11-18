package com.remous.thread.chapeter01.isAlive04;

/**
 * @Author: Remous
 * @Date: 2020/11/18 10:14
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 方法isAlive的功能是判断当前线程处于活动状态
 */
public class IsAlive {
    public static void main(String[] args) throws InterruptedException {

    }
    private static void testAliveEnd() throws  InterruptedException{
        MyThread myThread = new MyThread();
        System.out.println("begin == " + myThread.isAlive());
        myThread.start();
        Thread.sleep(1000);
        // 输出false，因为mythread对象已经在1s之内执行完毕
        // 另外，在是isAlive()方法时，如果将线程对象已构造参数的方式传递给Thread对象进行start启动时，
        // 运行的结果和前面testIsAlive是有差异。造成主要的差异的原因还是来自于Thread.currentThread和this的差异
        System.out.println("end == " + myThread.isAlive());
    }

    private static void testIsAlive(){
        MyThread myThread = new MyThread();
        System.out.println("线程 begin == "+myThread.isAlive());
        myThread.start();
        //虽然end 为true，但此值是不确定的。打印true是因为myThre线程还未执行完毕，所有输出true
        System.out.println("线程 end == " + myThread.isAlive());
    }
}
