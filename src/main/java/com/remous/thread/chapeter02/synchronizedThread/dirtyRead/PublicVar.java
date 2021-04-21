package com.remous.thread.chapeter02.synchronizedThread.dirtyRead;

/**
 * @Author: Remous
 * @Date: 2021/4/20 16:34
 * @ Nothing is impossible to a willing heart.
 */
public class PublicVar {
    public String userName = "A";

    public String password = "AA";

    public synchronized void setValue(String userName, String password) {
        this.userName = userName;
        try {
            Thread.sleep(5000);
            this.password = password;
            System.out.println("method setValue: thread is {0}" + Thread.currentThread().getName() +
            ";userName =" + userName + "; password = " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getValue() {
        System.out.println("getValue userName =" + userName + "; password = " + password);
    }

}
