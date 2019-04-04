package com.makenv.chapter_05.futureLast;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: lilimin
 * @Date: 2019/4/4 15:36
 */
public class Test {

    public static void main(String[] args) {
        try {
            MyCallable callable1 = new MyCallable("username1", 5000);
            MyCallable callable2 = new MyCallable("username2", 4000);
            MyCallable callable3 = new MyCallable("username3", 3000);

            List<Callable> callableList = new ArrayList<Callable>();
            callableList.add(callable1);
            callableList.add(callable2);
            callableList.add(callable3);

//            callableList.add(callable3);
//            callableList.add(callable2);
//            callableList.add(callable1);

            List<Future> futureList = new ArrayList<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 5, TimeUnit.SECONDS, new LinkedBlockingDeque<>());
            for (int i = 0; i < 3; i++) {
                futureList.add(executor.submit(callableList.get(i)));
            }

            System.out.println("run first time=" + System.currentTimeMillis());
            for (int i = 0; i < 3; i++) {
                System.out.println(futureList.get(i).get() + " " + System.currentTimeMillis());
            }
            executor.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
