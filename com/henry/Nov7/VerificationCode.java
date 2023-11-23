package com.henry.Nov7;

import java.util.Random;

public class VerificationCode {
    public static void main(String[] args) {
        char[] arr = new char[5];
        Random r = new Random();
        int index = r.nextInt(5);
        arr[index] = Number();
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                int choice = r.nextInt(2);
                if (choice == 0) {
                    arr[i] = SmallLetters();
                } else {
                    arr[i] = CapLetters();
                }
            }
        }
        String str = new String(arr);
        System.out.println(str);


    }

    public static char SmallLetters() {
        Random r = new Random();
        int i = r.nextInt(26) + 65;
        char c = (char) i;
        return c;
    }

    public static char CapLetters() {
        Random r = new Random();
        int i = r.nextInt(26) + 97;
        char c = (char) i;
        return c;
    }

    public static char Number() {
        Random r = new Random();
        int i = r.nextInt(10)+48;
        char c = (char) i;
        return c;
    }

}
