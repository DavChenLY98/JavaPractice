package com.henry.Nov7;

import java.util.Scanner;

public class NumOfWords {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = RightDelete(str);
        int count = 0;
        while (true) {
            if (arr[arr.length - count - 1] == ' ') {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }

    public static char[] RightDelete(String str) {
        char[] arr = str.toCharArray();
        int i = 0;
        while (true) {
            if (arr[str.length() - 1 - i] == ' ') {
                i++;
            } else {
                break;
            }
        }
        String str1 = str.substring(0, str.length() - i);

        return str1.toCharArray();
    }
}
