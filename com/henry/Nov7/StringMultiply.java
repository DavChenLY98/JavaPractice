package com.henry.Nov7;

public class StringMultiply {
    public static void main(String[] args) {
        String str1 = "25";
        String str2 = "20";
        int num1 = StringToInt(str1);
        int num2 = StringToInt(str2);
        int num = num1 * num2;
        char [] arr=IntToString(num);
        String str=new String(arr);
        System.out.println(str);

    }

    public static int StringToInt(String str) {
        int result = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[arr.length - i - 1] - 48;
            result = (int) (result + temp * Math.pow(10, i));
        }

        return result;
    }

    public static char[] IntToString(int num) {
        int count = 0;
        while (true) {
            int temp = (int) (num / Math.pow(10, count));
            if (temp == 0) {
                break;
            } else {
                count++;
            }
        }
        char[] arr = new char[count];
        for (int i = 0; i < count; i++) {
            int a = num % 10;
            num = num / 10;
            arr[count - i - 1] = (char) (a+48);
        }
        return arr;

    }
}
