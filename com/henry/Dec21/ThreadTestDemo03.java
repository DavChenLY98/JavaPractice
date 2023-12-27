package com.henry.Dec21;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadTestDemo03 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread03 myThread03=new MyThread03();
        FutureTask<Integer> ft=new FutureTask<>(myThread03);
        Thread t1=new Thread(ft);
        t1.start();
        System.out.println(ft.get());
    }
}
