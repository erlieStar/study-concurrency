package com.makenv.chapter_03.joinTest1;

public class Run {

    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
        //Thread.sleep();有时候我不知道子线程运行多长时间，所以不确定值
        System.out.println("主线程运行完毕");
    }
}
