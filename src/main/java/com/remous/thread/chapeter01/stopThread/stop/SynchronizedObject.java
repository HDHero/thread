package com.remous.thread.chapeter01.stopThread.stop;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:15
 * @ Nothing is impossible to a willing heart.
 */
public class SynchronizedObject {

    private String userName = "a";

    private String password = "aa";

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    synchronized public void printString(String userName, String password) {
        try {
            this.userName = userName;
            Thread.sleep(499);
            this.password = password;
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
