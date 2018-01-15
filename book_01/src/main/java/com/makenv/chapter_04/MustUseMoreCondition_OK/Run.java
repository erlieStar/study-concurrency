package com.makenv.chapter_04.MustUseMoreCondition_OK;

public class Run {

    public static void main(String[] args) {

        try {
            MyService myService = new MyService();
            ThreadA threadA = new ThreadA(myService);
            threadA.setName("A");
            threadA.start();
            ThreadB threadB = new ThreadB(myService);
            threadB.setName("B");
            threadB.start();
            Thread.sleep(3000);
            myService.signalAll_A();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
