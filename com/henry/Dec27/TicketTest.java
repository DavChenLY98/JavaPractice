package com.henry.Dec27;

public class TicketTest {
    public static void main(String[] args) {
        ThreadTicket t1=new ThreadTicket();
        ThreadTicket t2=new ThreadTicket();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();

    }
}
