package com.makenv.chapter_01.addPermitsCount;

import java.util.concurrent.Semaphore;

public class Run {

    public static void main(String[] args) {
        try {
            Semaphore semaphore = new Semaphore(5);
            //总共用掉3个许可
            semaphore.acquire(2);
            semaphore.acquire();
            //2
            System.out.println(semaphore.availablePermits());
            //增加2个许可
            semaphore.release(2);
            //4
            System.out.println(semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
