package com.henry.Dec27;

public class GetOddByThread extends Thread{
    static int count=100;

    @Override
    public void run() {
        while(true){
            synchronized(GetOddByThread.class){
                if(count==0){
                    break;
                }else{
                    if(count%2!=0){
                        System.out.println(getName()+"@"+count);
                    }
                    count--;
                }
            }
            Thread.yield();

        }
    }
}
