package com.henry.Dec12;

public class regexdemo02 {
    public static void main(String[] args) {
        String regex01="1[3-9]\\d{9}";//电话号码
        String regex02="0\\d{2,3}-?[1-9]\\d{4,9}";//座机号码
        String regex03="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";//邮箱的正则表达式

    }
}
