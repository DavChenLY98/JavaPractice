package com.henry.Nov9.PolymorphicDemo1;

public class Dog extends Animal{

    public Dog(int age,String color){
//        super.setAge(age);
//        super.setColor(color);
        super(age,color);
    }
    @Override
    public void eat(String something) {
        System.out.println(super.getAge()+"岁的"+super.getColor()+"颜色的狗两只前腿死死的抱住"+something+"猛吃");
    }

    public void lookHome(){
        System.out.println("狗正在看家");
    }
}
