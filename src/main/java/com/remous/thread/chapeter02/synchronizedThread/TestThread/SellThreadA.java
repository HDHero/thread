package com.remous.thread.chapeter02.synchronizedThread.TestThread;

/**
 * @Author: Remous
 * @Date: 2021/1/22 11:08
 * @ Nothing is impossible to a willing heart.
 */
public class SellThreadA implements Runnable{

    //public /*volatile*/ int balance;
    //疑问？为什么使用了volatile了，还是发生了线程不安全的情况
    public volatile int balance;
    //public  int balance;

    {
        this.balance = 100;
    }

    private  void buySomething() {
        this.balance -= 10;

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程" + Thread.currentThread().getName() + "还剩" + this.balance+ "钱");

        System.out.println("线程" + Thread.currentThread().getName() + "处理完成了");
    }

    @Override
    public  void run() {

        buySomething();

    }


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
