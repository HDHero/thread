package com.remous.thread.chapeter01.resume.unSynchronized;

/**
 * @Author: Remous
 * @Date: 2020/12/31 15:23
 * @ Nothing is impossible to a willing heart.
 */
public class RunApp {

    public static void main(String[] args) throws InterruptedException{

        MyObject myObject = new MyObject();

        Thread thread = new Thread(()->{
            myObject.setValue("remous", "111");
            System.out.println("thread :" + myObject.toString());

        });

        thread.setName("thread");

        thread.start();

        Thread.sleep(1000);

        Thread thread2 = new Thread(()-> {
            System.out.println("thread2: " + myObject.toString());
        });

        thread2.start();

    }
}
