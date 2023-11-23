package com.henry.Nov6;

import java.util.Scanner;
import java.util.StringJoiner;

public class ArabicToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        StringBuilder sb2 = new StringBuilder();
        StringJoiner sj=new StringJoiner(",","[","]");
        while (true) {
            System.out.println("请输入一个长度不超过9的只包含阿拉伯数字的字符串");
            str = sc.next();
            if (CheakStr(str)) {
                break;
            }
        }
//        sb2.append("[");
//        for (int i = 0; i < str.length(); i++) {
//            sb2.append(ArabicTrans(str.charAt(i)));
//            if(i<str.length()-1){
//                sb2.append(",");
//            }
//        }
//        sb2.append("]");
//        System.out.println(sb2.toString());
        for (int i = 0; i < str.length(); i++) {
            sj.add(ArabicTrans(str.charAt(i)));
        }

        System.out.println(sj);


    }

    public static boolean CheakStr(String str) {
        if (str.length() > 9) {
            System.out.println("输入的字符串长度超过9，请重新输入！");
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                System.out.println("输入的字符串中包含非阿拉伯数字的字符，请重新输入！");
                return false;
            }
        }
        return true;
    }

    public static String ArabicTrans(char c) {
        String[] arr = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        int index = c - 48;
        return arr[index];
    }


}
