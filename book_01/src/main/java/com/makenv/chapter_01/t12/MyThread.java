package com.makenv.chapter_01.t12;

public class MyThread extends Thread{

    @Override
    public synchronized void run() {
        for (int i=0; i<5000; i++) {
            System.out.println(i);
        }
    }
}
