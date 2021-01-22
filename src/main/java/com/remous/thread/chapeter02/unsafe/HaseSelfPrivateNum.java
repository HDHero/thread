package com.remous.thread.chapeter02.unsafe;

/**
 * @Author: Remous
 * @Date: 2021/1/6 0:35
 * @ Nothing is impossible to a willing heart.
 */
public class HaseSelfPrivateNum {

    private int num = 100;

    public void addI(String userName) {
        if (userName.equals("a")) {
            num += 10;
        }
        else if (userName.equals("b")) {
            num -= 20;
        }
        System.out.println("userName:" +userName+ "金额为 " + num);
    }

}
