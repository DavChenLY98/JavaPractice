package com.henry.Dec22;

public class MyThread03 extends Thread{

    static int ticket=0;
//    static Object lock=new Object();//这里要注意，锁也得是唯一的，这样在该类的不同进程对象调用run方法时，锁的效果才能实现。
    @Override
    public void run() {
        while(true){
            synchronized(MyThread03.class){//一般用本类的字节码文件对象，该对象是唯一的
                if(ticket<100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName()+"正在购买第"+ticket+"张票");
                }else{
                    break;
                }
            }
        }
    }
}
