package com.remous.thread.error;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建线程池
 * */
public class ThreadError {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            executorService.submit(new Task(){});
        }
    }

}

class Task implements Runnable{

    @Override
    public void run() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
    }
}

