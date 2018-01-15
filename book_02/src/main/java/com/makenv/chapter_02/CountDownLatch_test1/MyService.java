package com.makenv.chapter_02.CountDownLatch_test1;

import java.util.concurrent.CountDownLatch;

public class MyService {
    private CountDownLatch downLatch = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println("A");
            //等待
            downLatch.await();
            System.out.println("B");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMehtod() {
        System.out.println("X");
        //计数由1变为0，以前呈等待状态的线程继续向下运行
        downLatch.countDown();
    }
}
