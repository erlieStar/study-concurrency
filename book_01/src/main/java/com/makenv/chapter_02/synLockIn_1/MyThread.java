package com.makenv.chapter_02.synLockIn_1;

public class MyThread extends Thread{

    @Override
    public void run() {
        Service service = new Service();
        service.service1();
    }
}
