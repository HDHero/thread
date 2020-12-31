package com.remous.thread.chapeter01.stopThread.s1;

/**
 * @Author: Remous
 * @Date: 2020/11/18 16:27
 * @ Nothing is impossible to a willing heart.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for( int i = 0; i< 100000 ; i++){
            System.out.println("i = "+ (i + 1));
        }
    }
}
