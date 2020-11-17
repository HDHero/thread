package com.remous.thread.数据共享.线程安全;

/**
 * @Author: Remous
 * @Date: 2020/11/17 11:43
 * @ Nothing is impossible to a willing heart.
 */

/***
 * 不共享数据的情况
 */
public class MyThreadNotShare extends Thread{

    private int count=5;

    public MyThreadNotShare(String name){
        super();
        //设置线程名称
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+ " 计算,count="+count);
        }
    }
}
