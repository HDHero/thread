package com.remous.thread.数据共享;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:12
 * @working hard
 */
public class MySynThread extends Thread {

    int count=5;

    @Override
    public synchronized void run() {
        //此实例不能for循环，因为使用同步后其他线程得不到运行的机会了
        super.run();
        count--;
        System.out.println("由 "+currentThread().getName()+" 计算，count="+count);

    }
}
