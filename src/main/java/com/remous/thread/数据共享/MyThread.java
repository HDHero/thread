package com.remous.thread.数据共享;

/**
 * @Author: Remous
 * @Date: 2020/10/23 20:58
 * @working hard
 */
public class MyThread extends Thread {
    private int count=5;
    public MyThread(String name){
        super();
        //设置线程名称
        this.setName(name);
    }

    @Override
    public void run() {
        super.run();
        while (count>0){
            count--;
            System.out.println("由 "+currentThread().getName()+"计算，count="+count);
        }
    }
}
