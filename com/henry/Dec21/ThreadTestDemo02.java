package com.henry.Dec21;

public class ThreadTestDemo02 {
    public static void main(String[] args) {
        MyThread02 myThread02=new MyThread02();
        Thread t1=new Thread(myThread02);
        t1.setName("线程1");
        t1.start();
    }
}
