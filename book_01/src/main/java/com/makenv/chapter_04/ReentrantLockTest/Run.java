package com.makenv.chapter_04.ReentrantLockTest;

public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        MyThread myThread1 = new MyThread(myService);
        myThread.start();
        myThread1.start();
    }
}
