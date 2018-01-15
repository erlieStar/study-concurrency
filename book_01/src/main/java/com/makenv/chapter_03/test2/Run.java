package com.makenv.chapter_03.test2;

public class Run {

    public static void main(String[] args) {

        try {
            Object obj = new Object();
            MyThread1 myThread1 = new MyThread1(obj);
            myThread1.start();
            Thread.sleep(3000);
            MyThread2 myThread2 = new MyThread2(obj);
            myThread2.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
