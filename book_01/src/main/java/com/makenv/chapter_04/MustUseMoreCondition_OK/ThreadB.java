package com.makenv.chapter_04.MustUseMoreCondition_OK;

public class ThreadB extends Thread{

    private MyService myService;

    public ThreadB(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
