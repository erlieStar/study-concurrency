package com.makenv.chapter_01.SemaphoreTest1;

public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        ThreadB threadB = new ThreadB(service);
        threadA.setName("A");
        threadB.setName("B");
        threadA.start();
        /*
         * 因为设置最多一个线程，所以看起来是同步的效果
         * A begin 1515737097944
         * A end 1515737100945
         * B begin 1515737100945
         * B end 1515737103946
         */
        threadB.start();
    }
}
