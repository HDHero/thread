package com.remous.thread.chapeter02.synchronizedThread.dirtyRead;

/**
 * @Author: Remous
 * @Date: 2021/4/20 16:40
 * @ Nothing is impossible to a willing heart.
 */
public class ThreadA extends Thread {
    private PublicVar publicVar;
    private String userName;
    private String password;

    public ThreadA(String userName, String password, PublicVar publicVar) {
        this.publicVar = publicVar;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public void run() {
        publicVar.setValue(this.userName, this.password);
        super.run();
    }
}
