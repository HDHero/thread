package com.remous.thread.chapeter01.stopThread.s2;

/**
 * @Author: Remous
 * @Date: 2020/11/18 21:58
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread2 extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            for (int i =0; i < 500000; i++){
                if(this.interrupted()){
                    System.out.println("已经是停止状态了！ 我要退出");
                    throw new InterruptedException();
                }
            }
        }
        catch (InterruptedException e){

        }
    }
}
