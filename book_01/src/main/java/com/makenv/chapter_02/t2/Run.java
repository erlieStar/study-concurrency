package com.makenv.chapter_02.t2;

public class Run {

    public static void main(String[] args) {

        SelfPrivateNum selfPrivateNum = new SelfPrivateNum();
        MyThreadA myThreadA = new MyThreadA(selfPrivateNum);
        //b 200
        myThreadA.start();
        //a 200
        MyThreadB myThreadB = new MyThreadB(selfPrivateNum);
        myThreadB.start();
    }
}
