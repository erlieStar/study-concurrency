package com.makenv.chapter_01.Exchanger_2;
import java.util.concurrent.Exchanger;

public class ThreadA extends Thread {

    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("在线程A中获取线程B的值 " + exchanger.exchange("线程A的值"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
