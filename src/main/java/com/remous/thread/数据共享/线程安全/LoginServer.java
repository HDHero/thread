package com.remous.thread.数据共享.线程安全;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:58
 * @working hard
 */
public class LoginServer extends Thread {

    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("Remous","123");
    }
}
