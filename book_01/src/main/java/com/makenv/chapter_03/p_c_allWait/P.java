package com.makenv.chapter_03.p_c_allWait;

public class P implements Runnable{

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                while (!ValueObject.vlaue.equals("")) {
                    lock.wait();
                    System.out.println(Thread.currentThread().getName() + " waiting");
                }
                System.out.println(Thread.currentThread().getName() + " running");
                String value = System.currentTimeMillis() + "";
                ValueObject.vlaue = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            setValue();
        }
    }
}
