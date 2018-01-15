package com.makenv.chapter_01.t13;

public class Run {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(200);
        myThread.interrupt();
    }
}
