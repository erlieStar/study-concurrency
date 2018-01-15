package com.makenv.chapter_03.ThreadLocalTest;

public class ThreadA extends Thread{

    @Override
    public void run() {
        try {
            for (int i=0; i<10; i++) {
                Tools.t1.set("ThreadA " + i);
                Thread.sleep(200);
                System.out.println("ThreadA get value = " + Tools.t1.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
