package com.makenv.chapter_03.p_r_test;

public class P implements Runnable{

    private String lock;

    public P(String lock) {
        this.lock = lock;
    }

    public void setValue() {
        try {
            synchronized (lock) {
                if (!ValueObject.vlaue.equals("")) {
                    lock.wait();
                }
                String value = System.currentTimeMillis() + "";
                System.out.println("set的值为 " + value);
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
