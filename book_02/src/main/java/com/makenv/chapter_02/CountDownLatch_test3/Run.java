package com.makenv.chapter_02.CountDownLatch_test3;

import java.util.concurrent.CountDownLatch;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(5);
        MyThread[] myThreads = new MyThread[Integer.parseInt(latch.getCount() + "")];
        //为4的时候永远不会输出都来了，因为计数器没有减到0
        //MyThread[] myThreads = new MyThread[4];
        for (int i=0; i<myThreads.length; i++) {
            myThreads[i] = new MyThread(latch);
            myThreads[i].setName("线程" + (i + 1));
            myThreads[i].start();
        }
        latch.await();
        System.out.println("都来了");
    }
}
