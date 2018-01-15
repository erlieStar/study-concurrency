package com.makenv.chapter_01.availablePermitsTest;

import java.util.concurrent.Semaphore;

public class Run {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        //输出当前可用的许可数
        //5
        System.out.println(semaphore.availablePermits());
        //输出当前可用的许可数，并将许可数清零
        //5
        System.out.println(semaphore.drainPermits());
        //0
        System.out.println(semaphore.drainPermits());
    }
}
