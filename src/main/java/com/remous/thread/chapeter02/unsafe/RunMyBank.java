package com.remous.thread.chapeter02.unsafe;

/**
 * @Author: Remous
 * @Date: 2021/4/21 10:21
 * @ Nothing is impossible to a willing heart.
 */
public class RunMyBank {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Thread t1 = new Thread(bank);

        Thread t2 = new Thread(bank);

        t1.start();

        t2.start();
    }
}
