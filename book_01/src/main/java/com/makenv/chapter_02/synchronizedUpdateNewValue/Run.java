package com.makenv.chapter_02.synchronizedUpdateNewValue;

public class Run {

    public static void main(String[] args) {

        try {
            Service service = new Service();
            ThreadA a = new ThreadA(service);
            ThreadB b = new ThreadB(service);
            a.start();
            Thread.sleep(1000);
            b.start();
            System.out.println("已经发出停止命令");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
