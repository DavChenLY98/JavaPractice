package com.henry.Dec21;

public class MyThread02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":HelloWorld!");
        }
    }
}
