package com.remous.thread.chapeter01.stopThread.stop;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:21
 * @ Nothing is impossible to a willing heart.
 */
public class RunMyThreadStop {

    public static void main(String[] args) {
        try {
            SynchronizedObject object = new SynchronizedObject();
            MyThreadStop myThreadStop = new MyThreadStop(object);
            myThreadStop.start();

            Thread.sleep(500);
            myThreadStop.stop();
            System.out.println("username = " + object.getUserName() + " | password = " + object.getPassword());

        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
