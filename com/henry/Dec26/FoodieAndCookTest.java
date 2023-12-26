package com.henry.Dec26;

public class FoodieAndCookTest {
    public static void main(String[] args) {
        Foodie f=new Foodie();
        Cook c=new Cook();

        f.setName("吃货");
        c.setName("厨子");

        f.start();
        c.start();
    }
}
