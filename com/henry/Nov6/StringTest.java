package com.henry.Nov6;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        System.out.println("请输入字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        String str_temp = sb.reverse().toString();
        if(str.equals(str_temp)){
            System.out.println("是对称字符串");
        }else{
            System.out.println("不是对称字符串");
        }
    }
}
