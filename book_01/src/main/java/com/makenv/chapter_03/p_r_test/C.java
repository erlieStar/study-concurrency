package com.makenv.chapter_03.p_r_test;

public class C implements Runnable{

    private String lock;

    public C(String lock) {
        this.lock = lock;
    }

    public void getValue() {
        try {
            synchronized (lock) {
                if (ValueObject.vlaue.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值为 " + ValueObject.vlaue);
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
