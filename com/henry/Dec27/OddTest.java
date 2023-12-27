package com.henry.Dec27;

public class OddTest {
    public static void main(String[] args) {
        GetOddByThread t1=new GetOddByThread();
        GetOddByThread t2=new GetOddByThread();
        t1.setName("线程1");
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
