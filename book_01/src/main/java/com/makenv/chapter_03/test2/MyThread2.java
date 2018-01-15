package com.makenv.chapter_03.test2;

public class MyThread2 extends Thread{

    private Object lock;

    public MyThread2(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println("开始 notify time = " + System.currentTimeMillis());
                lock.notify();
                Thread.sleep(3000);
                System.out.println("结束 nofity time = " + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
