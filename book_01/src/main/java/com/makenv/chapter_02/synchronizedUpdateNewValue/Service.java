package com.makenv.chapter_02.synchronizedUpdateNewValue;

public class Service {

    private boolean isContinueRun = true;

    public void runMethod() {
        while (isContinueRun) {
            String anyString = new String();
            synchronized (anyString) {

            }
        }
        System.out.println("已经停下来了");
    }
    public void stopMethod() {
        isContinueRun = false;
    }

}
