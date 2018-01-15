package com.makenv.chapter_01.t3;

public class MyThread extends Thread{

    private int count = 3;

    @Override
    public synchronized void run() {
        count--;
        System.out.println(this.currentThread().getName() + count);
    }
}
