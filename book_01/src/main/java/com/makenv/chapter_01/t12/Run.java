package com.makenv.chapter_01.t12;

public class Run {

    public static void main(String[] args) {

        Thread.currentThread().interrupt();
        //是否停止? true
        System.out.println("是否停止? " + Thread.interrupted());
        //是否停止? false
        System.out.println("是否停止? " + Thread.interrupted());
    }
}
