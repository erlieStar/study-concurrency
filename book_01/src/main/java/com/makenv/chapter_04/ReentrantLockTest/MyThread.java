package com.makenv.chapter_04.ReentrantLockTest;

public class MyThread extends Thread{

    MyService myService;

    public MyThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
