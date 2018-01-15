package com.makenv.chapter_01.Exchanger_2;

import java.util.concurrent.Exchanger;

public class Run {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        ThreadA threadA = new ThreadA(exchanger);
        ThreadB threadB = new ThreadB(exchanger);
        //在线程B中获取线程A的值 线程A的值
        //在线程A中获取线程B的值 线程B的值
        threadA.start();
        threadB.start();
    }
}
