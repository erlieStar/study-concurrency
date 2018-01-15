package com.makenv.chapter_02.synLockIn_1;

import com.makenv.chapter_02.t2.MyThreadA;
import com.makenv.chapter_02.t2.SelfPrivateNum;

public class Run {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        //service1
        //service2
        myThread.start();
    }
}
