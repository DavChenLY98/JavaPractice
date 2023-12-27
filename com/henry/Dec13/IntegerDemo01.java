package com.henry.Dec13;

import java.util.Scanner;

public class IntegerDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        String str = sc.nextLine();
        Integer i = Integer.parseInt(str);
        System.out.println(i);
        System.out.println(i+1);
    }
}
