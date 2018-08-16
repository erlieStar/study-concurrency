package com.makenv.chapter_05.future_callable_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Run {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("打印的信息");
            }
        };
        /*
            1534436060409
            打印的信息
            null true 1534436062411
        */
        ExecutorService service = Executors.newCachedThreadPool();
        System.out.println(System.currentTimeMillis());
        Future future = service.submit(runnable);
        try {
            // 获得值，是否完成
            // get方法有阻塞特性，isDone无阻塞特性
            System.out.println(future.get() + " " + future.isDone() + " " + System.currentTimeMillis());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
