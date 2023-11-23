package com.henry.Nov7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringDisruption {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String str = sc.next();
        char[] arr = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            int index = r.nextInt(str.length());
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        String str2 = new String(arr);
        System.out.println(str2);
    }
}
