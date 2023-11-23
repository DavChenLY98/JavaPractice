package com.henry.Nov9.PolymorphicDemo1;

public class Cat extends Animal {

    public Cat(int age,String color){
//        super.setAge(age);
//        super.setColor(color);
        super(age,color);
    }
    @Override
    public void eat(String something) {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"颜色的猫眯着眼睛侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("猫正在捉老鼠");
    }
}
