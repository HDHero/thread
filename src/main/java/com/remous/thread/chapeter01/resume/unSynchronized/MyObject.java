package com.remous.thread.chapeter01.resume.unSynchronized;

/**
 * @Author: Remous
 * @Date: 2020/12/31 15:10
 * @ Nothing is impossible to a willing heart.
 */
public class MyObject {

    private String userName = "1";

    private String password = "pwd";

    public void setValue(String userName, String password) {

        this.userName = userName;

        if (Thread.currentThread().getName().equals("thread")) {
            System.out.println("停止线程thread ：" + Thread.currentThread().getName());
            Thread.currentThread().suspend();
        }

        this.password = password;

    }

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

    @Override
    public String toString() {
        return "MyObject{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
