package com.henry.Dec22;


public class ThreadTestDemo02 {
    public static void main(String[] args) {
        MyThread03 mt1=new MyThread03();
        MyThread03 mt2=new MyThread03();
        MyThread03 mt3=new MyThread03();
        mt1.start();
        mt2.start();
        mt3.start();


    }
}
