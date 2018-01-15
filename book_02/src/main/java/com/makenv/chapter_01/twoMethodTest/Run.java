package com.makenv.chapter_01.twoMethodTest;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        MyThread[] myThreads = new MyThread[4];
        /*
         * 2个线程在等待
         * 是否还有线程在等待信号量？ true
         * 1个线程在等待
         * 是否还有线程在等待信号量？ true
         * 0个线程在等待
         * 是否还有线程在等待信号量？ false
         */
        for (int i=0; i<3; i++) {
            myThreads[i] = new MyThread(service);
            myThreads[i].start();
        }
    }
}
