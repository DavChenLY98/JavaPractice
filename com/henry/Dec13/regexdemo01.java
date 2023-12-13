package com.henry.Dec13;

public class regexdemo01 {
    public static void main(String[] args) {
        String matches01 = "(.).+\\1";
        String matches02 = "(.+).+\\1";
        String matches03 = "((.)\\2*).+\\1";
    }
}
