package com.henry.Nov9.ExtentDemo1;

public class Test {
    public static void main(String[] args) {
        Chef c = new Chef("001","zhangsan",10000);
        c.work();
        c.eat();
        System.out.println(c.getId()+","+c.getName()+","+c.getSalary());
        Manager m = new Manager("100","Henry",30000,10000);
        m.work();
        m.eat();
        System.out.println(m.getId()+","+m.getName()+","+m.getSalary()+","+m.getBonus());
    }
}
