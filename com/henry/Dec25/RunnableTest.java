package com.henry.Dec25;

public class RunnableTest {
    public static void main(String[] args) {
        MyRunnable mb=new MyRunnable();
        Thread t1=new Thread(mb);
        Thread t2=new Thread(mb);
        Thread t3=new Thread(mb);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
