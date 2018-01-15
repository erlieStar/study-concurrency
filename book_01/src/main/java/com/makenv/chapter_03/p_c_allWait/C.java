package com.makenv.chapter_03.p_c_allWait;

public class C implements Runnable{

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                while (ValueObject.vlaue.equals("")) {
                    lock.wait();
                    System.out.println(Thread.currentThread().getName() + " waiting");
                }
                System.out.println(Thread.currentThread().getName() + " running");
                ValueObject.vlaue = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            getValue();
        }
    }
}
