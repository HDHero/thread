package com.remous.thread.数据共享.线程安全;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:59
 * @working hard
 */
public class RunMyLogin {
    public static void main(String[] args) {
        LoginServer loginServer=new LoginServer();
        loginServer.start();

        LogServer2 logServer2=new LogServer2();
        logServer2.start();
    }
}
