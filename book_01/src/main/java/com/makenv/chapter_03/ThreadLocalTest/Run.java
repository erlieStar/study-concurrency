package com.makenv.chapter_03.ThreadLocalTest;

public class Run {

    public static void main(String[] args) {

        try {
            ThreadA threadA = new ThreadA();
            threadA.start();
            for (int i=10; i<20; i++) {
                Tools.t1.set("Main " + i);
                Thread.sleep(200);
                System.out.println("Main get value = " + Tools.t1.get());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
