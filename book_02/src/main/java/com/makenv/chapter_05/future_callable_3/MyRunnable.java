package com.makenv.chapter_05.future_callable_3;


public class MyRunnable implements Runnable {

    private int num1;

    public MyRunnable(int num1) {
        this.num1 = num1;
    }

    public void run() {
        num1 = num1 + 10;
    }
}
