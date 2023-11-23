package com.henry.Nov2;

import java.util.Scanner;

public class CashTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额：");
        int cash = sc.nextInt();
        String result= CashTrans(cash);
        System.out.println(result);
    }

    public static String CashTrans(int cash) {
        String result = "";
        int a1 = cash % 10;
        int a2 = (cash - a1) / 10 % 10;
        int a3 = (cash - a2 * 10 - a1) / 100 % 10;
        result = result + Chinese(a3) + "佰" + Chinese(a2) + "拾" + Chinese(a1) + "元";


        return result;
    }

    public static String Chinese(int a) {
        String result = "";
        switch (a) {
            case 0:
                result = result + "零";
                break;
            case 1:
                result = result + "壹";
                break;
            case 2:
                result = result + "贰";
                break;
            case 3:
                result = result + "叁";
                break;
            case 4:
                result = result + "肆";
                break;
            case 5:
                result = result + "伍";
                break;
            case 6:
                result = result + "陆";
                break;
            case 7:
                result = result + "柒";
                break;
            case 8:
                result = result + "捌";
                break;
            case 9:
                result = result + "玖";
                break;

        }


        return result;
    }


}


