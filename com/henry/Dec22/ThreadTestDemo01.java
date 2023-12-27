package com.henry.Dec22;

public class ThreadTestDemo01 {
    public static void main(String[] args) throws InterruptedException {
        MyThread01 mt1 = new MyThread01();
        MyThread01 mt2 = new MyThread01();
        mt1.setName("线程1");
        mt2.setName("线程2");
//        mt2.setDaemon(true);
        mt1.start();
        mt1.join();
        mt2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程");
        }
    }
}
