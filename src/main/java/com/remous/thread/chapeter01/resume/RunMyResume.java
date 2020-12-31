package com.remous.thread.chapeter01.resume;

/**
 * @Author: Remous
 * @Date: 2020/12/31 14:45
 * @ Nothing is impossible to a willing heart.
 */

/**
 * 在使用suspend和resume方法时，如果使用不当，容易造成公共的同步对象的独占，使其它线程无法访问公共同步对象
 */
public class RunMyResume {

    public static void main(String[] args) throws InterruptedException{

        ResumeThread resumeThread = new ResumeThread();

        resumeThread.start();

        Thread.sleep(5000);

        //A
        resumeThread.suspend();

        System.out.println("A i = " + resumeThread.getI());

        Thread.sleep(5000);

        System.out.println("A i= " + resumeThread.getI());

        //B
        resumeThread.resume();

        System.out.println("B i = " + resumeThread.getI());

        Thread.sleep(5000);

        System.out.println("B i = " + resumeThread.getI());

        //C
        resumeThread.suspend();

        System.out.println("C i = " + resumeThread.getI());

        Thread.sleep(5000);

        System.out.println("C i = " + resumeThread.getI());



    }
}
