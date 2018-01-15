package com.makenv.chapter_01.Exchanger_2;
import java.util.concurrent.Exchanger;

public class ThreadB extends Thread {

    private Exchanger<String> exchanger;

    public ThreadB(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("在线程B中获取线程A的值 " + exchanger.exchange("线程B的值"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
