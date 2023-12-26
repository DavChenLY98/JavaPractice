package com.henry.Dec25;

public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread01 mt1=new MyThread01();
        MyThread01 mt2=new MyThread01();
        MyThread01 mt3=new MyThread01();

        mt1.setName("窗口1");
        mt2.setName("窗口2");
        mt3.setName("窗口3");

        mt1.start();
        mt2.start();
        mt3.start();

    }
}
