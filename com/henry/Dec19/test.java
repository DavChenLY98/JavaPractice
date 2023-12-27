package com.henry.Dec19;

public class test {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        try {
            System.out.println(arr[10]);
            System.out.println(1/0);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界");
        }catch (ArithmeticException e){
            System.out.println("算数异常");
        }
        System.out.println("看看我执行了吗？");
    }
}
