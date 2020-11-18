package com.remous.thread.chapeter01.线程安全01;

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
