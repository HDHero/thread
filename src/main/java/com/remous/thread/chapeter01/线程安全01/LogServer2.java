package com.remous.thread.chapeter01.线程安全01;

/**
 * @Author: Remous
 * @Date: 2020/10/23 21:59
 * @working hard
 */
public class LogServer2 extends Thread {
    @Override
    public void run() {
        super.run();
        LoginServlet.doPost("Emlia","123");
    }
}
