package com.makenv.chapter_02.synLockIn_1;

public class Service {

    public synchronized void service1() {
        System.out.println("service1");
        service2();
    }

    public synchronized void service2() {
        System.out.println("service2");
    }
}
