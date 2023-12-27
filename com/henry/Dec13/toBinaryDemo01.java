package com.henry.Dec13;

import java.util.Scanner;

public class toBinaryDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("请输入要求二进制的十进制数：");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = Integer.parseInt(str);
        while (true) {
            int remainder = i % 2;
            i = i / 2;
            sb.append(remainder);
            if(i==0){
                break;
            }
        }
        String string = sb.toString();
        String string1 = sb.reverse().toString();
        System.out.println(string);
        System.out.println(string1);
    }
}
