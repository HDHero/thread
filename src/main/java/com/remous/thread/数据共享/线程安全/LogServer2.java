package com.remous.thread.数据共享.线程安全;

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
