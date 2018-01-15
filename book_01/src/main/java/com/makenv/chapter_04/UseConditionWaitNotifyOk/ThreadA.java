package com.makenv.chapter_04.UseConditionWaitNotifyOk;

public class ThreadA extends Thread{

    private MyService myService;

    public ThreadA(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
