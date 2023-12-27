package com.henry.Dec27;

import java.util.concurrent.ArrayBlockingQueue;

public class Foodie extends Thread {

    static int count=10;
    ArrayBlockingQueue<String> queue;


    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if(count==0){
                break;
            }else{
                try {
                    count--;
                    queue.take();
                    System.out.println(getName()+"正在吃面条,还能吃"+count+"碗！！");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}

