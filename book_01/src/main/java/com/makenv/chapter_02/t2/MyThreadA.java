package com.makenv.chapter_02.t2;

public class MyThreadA extends Thread{

    private SelfPrivateNum selfPrivateNum;

    public MyThreadA(SelfPrivateNum selfPrivateNum) {
        this.selfPrivateNum = selfPrivateNum;
    }

    @Override
    public void run() {
        selfPrivateNum.add("a");
    }
}
