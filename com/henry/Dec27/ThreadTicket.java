package com.henry.Dec27;

public class ThreadTicket extends Thread{
    static int ticket=1000;

    @Override
    public void run() {
        while(true){
            synchronized(ThreadTicket.class){
                if(ticket==0){
                    break;
                }else{
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket--;
                    System.out.println(getName()+"卖出第"+(1000-ticket)+"张票,还剩"+ticket+"张票！！");
                }
            }
        }
    }
}
