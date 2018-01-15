package com.makenv.chapter_02.synchronizedUpdateNewValue;

public class ThreadB extends Thread{

    private Service service;

    public ThreadB(Service service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.stopMethod();
    }
}
