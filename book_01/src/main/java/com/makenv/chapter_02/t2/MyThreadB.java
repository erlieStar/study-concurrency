package com.makenv.chapter_02.t2;

public class MyThreadB extends Thread{

    private SelfPrivateNum selfPrivateNum;

    public MyThreadB(SelfPrivateNum selfPrivateNum) {
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        selfPrivateNum.add("b");
    }
}
