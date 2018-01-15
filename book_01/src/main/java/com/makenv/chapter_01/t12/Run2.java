package com.makenv.chapter_01.t12;

public class Run2 {

    public static void main(String[] args) throws InterruptedException {

        MyThread myThread = new MyThread();
        myThread.start();
        Thread.sleep(20);
        myThread.interrupt();
        System.out.println("是否停止? " + myThread.isInterrupted());
        System.out.println("是否停止? " + myThread.isInterrupted());
    }
}
