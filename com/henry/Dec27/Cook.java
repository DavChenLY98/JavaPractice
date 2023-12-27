package com.henry.Dec27;

import java.security.cert.CertPath;
import java.util.concurrent.ArrayBlockingQueue;

public class Cook extends Thread{
    static int count=10;
    ArrayBlockingQueue<String> queue;
    public Cook(ArrayBlockingQueue<String> queue){
        this.queue=queue;
    }

    @Override
    public void run() {
        while (true){
            if(count==0){
                break;
            }else{
                try {
                    queue.put("面条");
                    System.out.println(getName()+"正在做第"+(11-count)+"碗面条!!!!");
                    count--;//这里将调整剩余面条数量的代码写在了锁外，会对结果造成影响！！
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
