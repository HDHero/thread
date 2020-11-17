package com.remous.thread.error;

import java.util.Timer;

/**
 * 定时器
 * */
public class TimerTask {

    public static void main(String[] args) {
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new java.util.TimerTask() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },1000,1000);
    }
}
