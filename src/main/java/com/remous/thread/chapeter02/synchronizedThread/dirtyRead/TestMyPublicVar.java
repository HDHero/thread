package com.remous.thread.chapeter02.synchronizedThread.dirtyRead;

/**
 * @Author: Remous
 * @Date: 2021/4/20 16:43
 * @ Nothing is impossible to a willing heart.
 */
public class TestMyPublicVar {

    public static void main(String[] args) throws InterruptedException {
        PublicVar publicVar = new PublicVar();

        Thread threadA = new ThreadA("B", "BB", publicVar);

        Thread.sleep(5000);
        threadA.start();
    }
}
