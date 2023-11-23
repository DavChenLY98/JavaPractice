package com.henry.Nov8.ExtenseDemo1;

public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Eat() {
        System.out.println(this.name + "正在吃饭");
    }

    public void Drink() {
        System.out.println(this.name + "正在喝水");
    }
}
