package com.remous.thread.数据共享.syncProj;

/**
 * @Author: Remous
 * @Date: 2020/11/17 21:15
 * @ Nothing is impossible to a willing heart.
 */

/***
 * 5个销售员卖出一个货品后不可以得出相同的剩余数量。必须在每一个销售员卖完一个货品后
 * 其他销售员才可以在新的剩余物品数上减1操作。这是就需要使用多个线程之间进行同步
 */
public class SafeSale extends Thread{
    private int count=5;

//    @Override
//    public synchronized void run() {
//
//        super.run();
//
//        count--;
//        System.out.println("由 "+this.currentThread().getName()+ "计算,count="+count);
//    }
    @Override
    public  void run() {

        super.run();

        count--;
        System.out.println("由 "+this.currentThread().getName()+ "计算,count="+count);
    }
}
