package com.remous.thread.chapeter01.resume.lockStop;

/**
 * @Author: Remous
 * @Date: 2020/12/31 15:03
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread {

    private long i = 0;

    @Override
    public void run() {
        while (true) {
            ++i;
            //当程序运行到println方法内部停止时，同步锁未被释放
            //println源码
            //        synchronized (this) {
            //            print(x);
            //            newLine();
            //        }
            if (i % 10000 ==0) {
                System.out.println(i);
            }
        }
    }
}
