package com.henry.Dec12;

public class regexdemo01 {
    public static void main(String[] args) {
        String qq="1234a567890";
        boolean matches = qq.matches("[1-9]\\d{5,19}");
        System.out.println(matches);

    }
}
