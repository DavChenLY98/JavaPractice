package com.henry.Oct31;

import java.util.Scanner;

public class ItemTest {
    public static void main(String[] args) {
        Item[] arr = new Item[3];
//        Scanner s = new Scanner(System.in);
//        for(int i=0;i<arr.length;i++){
//            System.out.println("请输入商品ID：");
//            String id= s.next();
//            System.out.println("请输入商品名称：");
//            String name=s.next();
//            System.out.println("请输入商品价格：");
//            double value=s.nextDouble();
//            System.out.println("请输入商品数量：");
//            int number=s.nextInt();
//            Item item=new Item(id,name,value,number);
//            arr[i]=item;
//        }



        Item i1 = new Item("001", "百岁山", 3, 300);
        Item i2 = new Item("002", "农夫山泉", 2, 500);
        Item i3 = new Item("003", "百事可乐", 3, 200);


        arr[0]=i1;
        arr[1]=i2;
        arr[2]=i3;

        for (int i=0;i<arr.length;i++){
            System.out.printf("ID:%s,Name:%s,Value:%s,Number:%s",arr[i].getID(),arr[i].getName()
            ,arr[i].getValue(),arr[i].getNumber());
            System.out.println();
        }
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i].getValue();
        }
        double avg=sum/arr.length;


        System.out.println("三种饮料的平均价格为："+avg);
        int count=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i].getValue()<avg){
                count++;
            }
        }
        Item [] arr2=new Item[count];
        for(int i=1;i<arr.length;i++){
            int temp=0;
            if(arr[i].getValue()<avg){
                arr2[temp]=arr[i];
                temp++;
            }
        }

        System.out.println("比平均价格第的饮料有"+count+"个,它们的信息如下：");
        for (int i=0;i<arr2.length;i++){
            System.out.printf("ID:%s,Name:%s,Value:%s,Number:%s",arr2[i].getID(),arr2[i].getName()
                    ,arr2[i].getValue(),arr2[i].getNumber());
            System.out.println();
        }

    }
}
