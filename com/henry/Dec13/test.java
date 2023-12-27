package com.henry.Dec13;

public class test {
    public static void main(String[] args) {
        String [] str={"a","aa","aaa"};
        str[0]="b";
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }

    }
}
