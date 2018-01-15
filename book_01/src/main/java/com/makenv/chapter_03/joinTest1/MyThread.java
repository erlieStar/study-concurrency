package com.makenv.chapter_03.joinTest1;

public class MyThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("子线程运行结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
