package com.makenv.chapter_03.p_c_allWait;

public class Run {

    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        Thread[] threadp = new Thread[2];
        Thread[] threadc = new Thread[2];
        for (int i=0; i<2; i++) {
            threadp[i] = new Thread(p, "生产者" + (i + 1));
            threadp[i].start();
            threadc[i] = new Thread(c, "消费者" + (i + 1));
            threadc[i].start();
        }
        Thread.sleep(5000);
        Thread[] threads = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
        Thread.currentThread().getThreadGroup().enumerate(threads);
        for (int i = 0; i < threads.length; i++) {
            System.out.println("状态" + threads[i].getName() + " " + threads[i].getState());
        }
    }
}
