package com.henry.Dec13;

import java.util.ArrayList;
import java.util.Scanner;

public class testDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要添加在数组中的数");
        while(SumOfList(arrayList)<=200){
            String s = sc.nextLine();
            int i = Integer.parseInt(s);
            if(i<1||i>100){
                System.out.println("输入的数字不符合规范，请重新输入");
                continue;
            }
            arrayList.add(i);
            arrayList.toString();
        }
        String [] arrstr={"1","2","3"};
        System.out.println(arrayList);
        System.out.println(arrstr);
    }

    private static int SumOfList(ArrayList<Integer> arrayList) {
        int sum=0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum=sum+arrayList.get(i);
        }
        return sum;
    }
}
