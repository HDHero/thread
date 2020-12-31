package com.remous.thread.chapeter01.stopThread.s4returnThread;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:34
 * @ Nothing is impossible to a willing heart.
 */
public class RunReturnThread  {

    public static void main(String[] args) throws InterruptedException{

        ReturnThread returnThread = new ReturnThread("Remous");

        returnThread.start();

        Thread.sleep(3000);

        returnThread.interrupt();
    }
}
