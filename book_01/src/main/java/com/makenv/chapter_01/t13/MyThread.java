package com.makenv.chapter_01.t13;

public class MyThread extends Thread{

    @Override
    public void run() {

        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }
            System.out.println(System.currentTimeMillis());
        }
    }
}
