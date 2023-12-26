package com.henry.Dec11;

public class testEquals {
    public static void main(String[] args) {
        String s="abc";
        StringBuilder sb= new StringBuilder("abc");

        System.out.println(s.equals(sb));
        System.out.println(sb.equals(s));
    }
}
