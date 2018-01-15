package com.makenv.chapter_02.CountDownLatch_test2_3_ext;

import java.util.concurrent.CountDownLatch;

public class Run {

    public static void main(String[] args) {

        CountDownLatch waitRunTag = new CountDownLatch(3);
        CountDownLatch beginTag = new CountDownLatch(1);
        CountDownLatch endTag = new CountDownLatch(3);

        try {
            System.out.println("各就各位");
            MyThread[] threads = new MyThread[3];
            for (int i=0; i<threads.length; i++) {
                threads[i] = new MyThread(waitRunTag, beginTag, endTag);
                threads[i].start();
            }
            waitRunTag.await();
            System.out.println("发令枪响起");
            beginTag.countDown();
            endTag.await();
            System.out.println("所有运动员到达，统计名次");
            /*
                各就各位
                准备起跑
                准备起跑
                准备起跑
                Thread-2 准备好了
                Thread-0 准备好了
                Thread-1 准备好了
                发令枪响起
                Thread-2运动员开始起跑，跑步时间不确定
                Thread-0运动员开始起跑，跑步时间不确定
                Thread-1运动员开始起跑，跑步时间不确定
                Thread-1运动员到达终点
                Thread-2运动员到达终点
                Thread-0运动员到达终点
                所有运动员到达，统计名次
            */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
