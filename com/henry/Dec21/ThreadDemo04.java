package com.henry.Dec21;

public class ThreadDemo04 {
    public static void main(String[] args) {
        MyThread myThread01=new MyThread();
        MyThread myThread02=new MyThread();
        myThread01.setPriority(10);
        myThread02.setPriority(5);
        myThread01.start();
        myThread02.start();


    }
}
