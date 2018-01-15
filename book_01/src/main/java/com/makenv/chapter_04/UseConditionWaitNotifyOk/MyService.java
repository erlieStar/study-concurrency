package com.makenv.chapter_04.UseConditionWaitNotifyOk;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await() {
        try {
            //condition.await()方法调用之前调用lock.lock()代码获得同步监视器
            lock.lock();
            System.out.println("await时间为 " + System.currentTimeMillis());
            condition.await();
        } catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void signal() {
        try {
            lock.lock();
            System.out.println("signal时间为 " + System.currentTimeMillis());
            condition.signal();
        } finally {
            lock.unlock();
        }

    }
}
