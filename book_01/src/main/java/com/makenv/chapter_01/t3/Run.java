package com.makenv.chapter_01.t3;

public class Run {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "a");
        Thread b = new Thread(myThread, "b");
        Thread c = new Thread(myThread, "c");
        //a2
        //b1
        //c0
        a.start();
        b.start();
        c.start();
    }
}
