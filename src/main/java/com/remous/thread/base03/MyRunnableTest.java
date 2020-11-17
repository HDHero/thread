package com.remous.thread.base03;

public class MyRunnableTest implements Runnable {

    public static void main(String[] args) {
        Thread t1=new Thread(new MyRunnableTest());
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("This is for MyTest Run");
    }
}
