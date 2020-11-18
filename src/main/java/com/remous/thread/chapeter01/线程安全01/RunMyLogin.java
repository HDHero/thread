package com.remous.thread.chapeter01.线程安全01;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:59
 * @working hard
 */

/**
 * 非线程安全问题
 */
public class RunMyLogin {
    public static void main(String[] args) {
        LoginServer loginServer=new LoginServer();
        loginServer.start();

        LogServer2 logServer2=new LogServer2();
        logServer2.start();
    }
}
