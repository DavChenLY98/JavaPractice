package com.henry.Nov8.ArrayListDemo2;

import java.util.ArrayList;
import java.util.Scanner;

public class UserListCheak {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        User u1 = new User("001", "David", "123456");
        User u2 = new User("002", "Henry", "123456");
        User u3 = new User("003", "John", "123456");
        list.add(u1);
        list.add(u2);
        list.add(u3);
        System.out.println("请输入要查找的用户id：");
        Scanner sc = new Scanner(System.in);
        String id = sc.next();
        System.out.println(IfExist(list,id));

    }

    public static boolean IfExist(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
