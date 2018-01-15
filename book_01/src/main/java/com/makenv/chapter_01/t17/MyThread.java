package com.makenv.chapter_01.t17;

public class MyThread extends Thread{

    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int i=0; i<500000; i++) {
            Thread.yield();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("运行时间" + (endTime - beginTime));
    }
}
