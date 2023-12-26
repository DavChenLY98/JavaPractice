package com.henry.Dec25;

public class MyThread01 extends Thread {

    static int ticket = 0;


    @Override
    public void run() {

        while (true) {
            synchronized (MyThread01.class) {
                if (ticket >= 100) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "@正在卖第" + ticket + "张票");
                }

            }
        }
        ;

    }
}
