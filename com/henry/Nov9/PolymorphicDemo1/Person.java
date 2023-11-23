package com.henry.Nov9.PolymorphicDemo1;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a,String something){
        if (a instanceof Dog) {
            System.out.println("年龄为"+this.age+"岁的"+this.getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的狗");
            a.eat(something);
        }else if(a instanceof Cat){
            System.out.println("年龄为"+this.age+"岁的"+this.getName()+"养了一只"+a.getColor()+"颜色的"+a.getAge()+"岁的猫");
            a.eat(something);
        }
    }
}
