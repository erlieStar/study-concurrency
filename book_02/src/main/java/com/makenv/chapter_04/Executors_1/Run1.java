package com.makenv.chapter_04.Executors_1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Run1 {

    public static void main(String[] args) {

        //创建的是无界线程池，可以进行线程自动回收，所谓“无界线程池”就是池中存放线程个数是理论上的Interger.MAX_VALUE最大值
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    System.out.println("Runnable1 begin " + System.currentTimeMillis());
                    System.out.println("A");
                    Thread.sleep(1000);
                    System.out.println("Runnable1 end " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        /*
            Runnable1 begin 1516001954093
            A
            Runnable2 begin 1516001954093
            B
            Runnable1 end 1516001955093
            Runnable2 end 1516001955094
         */
        executorService.execute(new Runnable() {
            public void run() {
                try {
                    System.out.println("Runnable2 begin " + System.currentTimeMillis());
                    System.out.println("B");
                    Thread.sleep(1000);
                    System.out.println("Runnable2 end " + System.currentTimeMillis());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
