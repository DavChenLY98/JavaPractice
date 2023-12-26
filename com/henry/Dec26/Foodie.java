package com.henry.Dec26;

public class Foodie extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized(Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodflag==0){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        Desk.count--;
                        System.out.println(getName()+"正在吃面条，还能吃"+Desk.count+"碗！！！");
                        Desk.foodflag=0;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
