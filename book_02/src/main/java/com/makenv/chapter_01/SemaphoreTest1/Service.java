package com.makenv.chapter_01.SemaphoreTest1;

import java.util.concurrent.Semaphore;

public class Service {

    //设置最多允许多少个线程同时执行acquire()和release()之间的代码
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " begin " + System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " end " + System.currentTimeMillis());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
