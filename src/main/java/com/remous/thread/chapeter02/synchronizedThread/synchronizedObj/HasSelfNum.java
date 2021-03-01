package com.remous.thread.chapeter02.synchronizedThread.synchronizedObj;

/**
 * @Author: Remous
 * @Date: 2021/1/22 13:51
 * @ Nothing is impossible to a willing heart.
 */
public class HasSelfNum {

    private int num;

    public synchronized void addNum(String target) {
        if (target.equals("a")) {
            num = 100;
            System.out.println("target: " + target + " num is" + num);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        } else if (target.equals("b")) {
            num = 200;
            System.out.println("target: " + target + " num is" + num);
        }
        System.out.println("target :" + target + "set over");
    }


}
