package com.remous.thread.chapeter01.isAlive;

/**
 * @Author: Remous
 * @Date: 2020/11/18 10:57
 * @ Nothing is impossible to a willing heart.
 */
// LOG信息
/**
 * CountOpearte--begin
 * Thread.currentThread.getName()=main
 * Thread.currentThread.isAlive()=true
 * this.getName()=Thread-0
 * this.isAlvie()=false
 * CountOpearte--end
 * main begin t1 isAlive =false
 * main end t1 isAlive=true
 * run ---begin
 * run Thread.currentThread().getName()=Remous
 * run Thread.currentThread().isAlive()=true
 * run this.getName()=Thread-0
 * run this.isAlive()= false
 */

/**
 * 1.根据打印的Log可以知道调用CountOperate构造函数的是main线程，因此打印出
 *
 * Thread.currentThread().getName()=main
 * Thread.currentThread().isAlive()=true
 *
 * 2.而此时还没有启动CountOperate子线程所以打印出
 * this.getName=Thread-0
 * this.isAlive()=false
 *
 * 3.此时this代表的是CountOperate对象实例，所以Thread.currentThread()==this :false
 */

/**
 * 4.this 与 Thread.currentThread（）不是同一个引用
 *
 *  线程在初始化对象的时候， this代表的当前对象MyThread，然后Thread在初始化对象的时候，会给线程起一个默认的初始名，所以this.getname()打印出来是“当前线程的名字：Thread-0”。
 *  (1) 在执行“ thread.start();”时，因为**myThread作为参数传入Thread中，其实是myThread委托thread去执行；**所以在执行–“ thread.setName(“C”);”，通过“**Thread.currentThread().getName()”**打印出来时“当前线程的名字：C”。
 *
 *  (2) 但是此时执行this.getname（）仍然代表的是Mythread这个对象，所以打印出来的仍然是“当前线程的名字：Thread-0”
 *
 */

/**
 * 5.结论
 * ①Thread.currentThread表示当前代码段正在被哪个线程调用的相关信息。
 *
 * ②this表示的是当前对象，与Thread.currentThread有很大的区别。
 */
public class RunMyOperate {
    public static void main(String[] args) {
        CountOperate c = new CountOperate();
        Thread t1 = new Thread(c);
        System.out.println("main begin t1 isAlive =" + t1.isAlive());
        t1.setName("Remous");
        t1.start();
        System.out.println("main end t1 isAlive=" +t1.isAlive());
    }
}