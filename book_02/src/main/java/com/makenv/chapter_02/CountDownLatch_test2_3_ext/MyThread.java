package com.makenv.chapter_02.CountDownLatch_test2_3_ext;

import java.util.concurrent.CountDownLatch;

public class MyThread extends Thread {

    private CountDownLatch waitRunTag;   //等待起跑
    private CountDownLatch beginTag;         //起跑
    private CountDownLatch endTag;           //所有运动员到达终点

    public MyThread(CountDownLatch waitRunTag, CountDownLatch beginTag, CountDownLatch endTag) {
        this.waitRunTag = waitRunTag;
        this.beginTag = beginTag;
        this.endTag = endTag;
    }

    @Override
    public void run() {
        try {
            System.out.println("准备起跑");
            //Math.random是生成[0,1)的随机数
            Thread.sleep((int)(Math.random() * 5000));
            waitRunTag.countDown();
            System.out.println(Thread.currentThread().getName() + " 准备好了");
            beginTag.await();
            System.out.println(Thread.currentThread().getName() + "运动员开始起跑，跑步时间不确定");
            Thread.sleep((int)(Math.random() * 5000));
            System.out.println(Thread.currentThread().getName() + "运动员到达终点");
            endTag.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
