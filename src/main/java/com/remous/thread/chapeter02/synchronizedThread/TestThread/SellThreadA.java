package com.remous.thread.chapeter02.synchronizedThread.TestThread;

/**
 * @Author: Remous
 * @Date: 2021/1/22 11:08
 * @ Nothing is impossible to a willing heart.
 */
public class SellThreadA implements Runnable{

    public /*volatile*/ int balance;

    {
        this.balance = 100;
    }

    private synchronized void buySomething() {
        this.balance -= 10;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("还剩" + this.balance+ "钱");
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
