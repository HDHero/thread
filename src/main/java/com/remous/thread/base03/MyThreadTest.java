package com.remous.thread.base03;

public class MyThreadTest extends Thread {
    @Override
    public void run() {

        System.out.println("this for thread test");
    }

    public static void main(String[] args) {
        Thread t1=new MyThreadTest();
        t1.start();
    }
}
