package com.henry.Nov8.ArrayListDemo1;

import java.util.ArrayList;

public class PhoneTest {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        ArrayList<Phone> result = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        result= Info(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getBrand()+","+result.get(i).getPrice());
        }
    }

    public static ArrayList<Phone> Info(ArrayList<Phone> list) {
        ArrayList<Phone> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 3000) {
                result.add(list.get(i));
            }
        }
        return result;
    }


}
