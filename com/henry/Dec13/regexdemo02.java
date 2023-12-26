package com.henry.Dec13;

public class regexdemo02 {
    public static void main(String[] args) {
        String str = "我要要要要要学学学学学学学学学编编编编编编编编编程程程程程程程程程程";
        String str2 = str.replaceAll("(.)\\1+", "$1");
        System.out.println(str2);
    }
}
