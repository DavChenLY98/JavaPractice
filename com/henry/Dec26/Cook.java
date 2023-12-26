package com.henry.Dec26;

public class Cook extends Thread{
    @Override
    public void run() {
        while(true){
            synchronized(Desk.lock){
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodflag==1){
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else{
                        System.out.println(getName()+"正在做第"+(11-Desk.count)+"碗面条");
                        Desk.foodflag=1;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
