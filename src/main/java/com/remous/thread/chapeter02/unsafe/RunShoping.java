package com.remous.thread.chapeter02.unsafe;

import com.remous.thread.chapeter02.synchronizedThread.HasSelfPrivateNum;

/**
 * @Author: Remous
 * @Date: 2021/1/5 23:20
 * @ Nothing is impossible to a willing heart.
 */
public class RunShoping {

    public static void main(String[] args) {
        HaseSelfPrivateNum hasSelfPrivateNum = new HaseSelfPrivateNum();

        Thread ta = new TreadA(hasSelfPrivateNum);

        Thread tb = new TreadB(hasSelfPrivateNum);

        ta.start();

        tb.start();
    }
}
