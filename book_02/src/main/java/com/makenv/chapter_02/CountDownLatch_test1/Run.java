package com.makenv.chapter_02.CountDownLatch_test1;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService myService = new MyService();
        MyThread myThread = new MyThread(myService);
        myThread.start();
        Thread.sleep(2000);
        //A X B
        myService.downMehtod();
    }
}
