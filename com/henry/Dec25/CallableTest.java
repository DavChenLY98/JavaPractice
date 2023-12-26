package com.henry.Dec25;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();
        FutureTask<Integer> fk = new FutureTask<>(mc);
        Thread t = new Thread(fk);
        t.setName("线程1");
        t.start();
        Integer result = fk.get();
        System.out.println(result);
    }
}
