package com.remous.thread.chapeter01.stopThread;

/**
 * @Author: Remous
 * @Date: 2021/1/6 20:31
 * @ Nothing is impossible to a willing heart.
 */
public class stopThreadWithSleep {
    //带有sleep的中断线程的写法
        public static void main(String args[]) throws InterruptedException{
            Runnable runnable = ()->{
                //打印出100的倍数
                int num = 0;
                try{
                    while (num <=300 && !Thread.currentThread().isInterrupted()) {
                        if (num % 100 ==0 ){
                            System.out.println("是100的倍数" + num);
                        }
                        num++;
                    }
                    Thread.sleep(1000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
            Thread.sleep(500);
            thread.interrupt();
        }
}
