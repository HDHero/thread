package com.remous.thread.chapeter02.synchronizedThread;

/**
 * @Author: Remous
 * @Date: 2020/12/31 17:41
 * @ Nothing is impossible to a willing heart.
 */
public class HasSelfPrivateNum {

    public void addI (String userName) throws InterruptedException{

        int num = 0;
        if (userName.equals("a")) {
            num = 100;
            System.out.println("a set over");
            Thread.sleep(2000);
        } else {
            num = 200;
            System.out.println("b set over");

        }
        System.out.println(userName + " num = " +num);

    }
}
