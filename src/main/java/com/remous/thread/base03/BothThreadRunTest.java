package com.remous.thread.base03;

/**
 * 同时使用thread和Runnable
 * */
public class BothThreadRunTest {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("this is for Runnable");
            }
        })
        {
            @Override
            public void run() {
                System.out.println("this is for Thread");
            }
        }.start();
    }
}
