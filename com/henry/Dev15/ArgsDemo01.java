package com.henry.Dev15;

import java.util.Scanner;

public class ArgsDemo01 {
    public static void main(String[] args) {
        int result = testDemo01(1,2,3,4,5,6,7);
        System.out.println(result);
    }

    private static int testDemo01(int... args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            sum += args[i];
        }
        return sum;
    }
}
