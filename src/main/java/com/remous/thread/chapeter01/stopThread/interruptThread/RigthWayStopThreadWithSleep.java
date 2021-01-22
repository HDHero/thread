package com.remous.thread.chapeter01.stopThread.interruptThread;

/**
 * @Author: Remous
 * @Date: 2021/1/6 20:44
 * @ Nothing is impossible to a willing heart.
 */
public class RigthWayStopThreadWithSleep {
        //带有sleep的中断线程的写法
        public static void main(String args[]) throws InterruptedException{
            Runnable runnable = ()->{
                //打印出100的倍数
                int num = 0;
                try{
                    while (num <=300 ) {
                        //如果在循环会出现线程被阻塞的情况，就不需要加入interrupt判断
                        if (num % 100 ==0 ){
                            System.out.println("是100的倍数" + num);
                        }
                        num++;
                        Thread.sleep(10);

                    }
                }
                catch (InterruptedException e) {
                    //线程可能被阻塞，响应响应中断线程的
                    System.out.println("线程中断");
                    e.printStackTrace();
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
            Thread.sleep(5000);
            //线程正在sleep中，此时中断，会抛出字段异常
            thread.interrupt();
        }
}
