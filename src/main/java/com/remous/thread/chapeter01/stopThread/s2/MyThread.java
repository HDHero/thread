package com.remous.thread.chapeter01.stopThread.s2;

/**
 * @Author: Remous
 * @Date: 2020/11/18 17:31
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread{

    //虽然实例停止了线程，但如果for语句下面还有语句，还是会继续运行的。
    //那么该如何解决语句继续运行的问题呢？建MyThread2
    @Override
    public void run() {
        super.run();
        for(int i = 0; i < 500000; i++){
            if(this.interrupted()){
                System.out.println("已经是停止状态了。。。");
                break;
            }

            System.out.println("i=" + (i + 1));
        }
        System.out.println("我被输出，如果此代码是for又继续运行，线程并未停止！");

    }
}
