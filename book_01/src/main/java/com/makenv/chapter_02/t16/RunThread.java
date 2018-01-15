package com.makenv.chapter_02.t16;

public class RunThread extends Thread{

    private volatile boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("进入run方法");
        while (isRunning) {

        }
        System.out.println("线程被停止");
    }
}
