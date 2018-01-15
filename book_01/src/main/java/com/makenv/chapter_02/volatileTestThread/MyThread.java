package com.makenv.chapter_02.volatileTestThread;

public class MyThread extends Thread{

    public static volatile int count;

    private static void addCount() {
        for (int i=0; i<100; i++) {
            count++;
        }
        System.out.println(count);
    }

    @Override
    public void run() {
        addCount();
    }
}
