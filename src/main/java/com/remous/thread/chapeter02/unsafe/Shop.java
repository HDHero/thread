package com.remous.thread.chapeter02.unsafe;

/**
 * @Author: Remous
 * @Date: 2021/1/5 23:18
 * @ Nothing is impossible to a willing heart.
 */
public class Shop {

    //初始化金钱为100
    public int cash = 100;

    //金钱减少的方法
    public void cashOut() {
        this.cash -= 10;
    }


}
