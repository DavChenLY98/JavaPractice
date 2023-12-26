package com.henry.Dec16;

public class test {
    public static void main(String[] args) {
        int x=2147395600;
        int i=1;
        long result=0;
        while(result<=x){
            i++;
            result=(long)i*i;
            System.out.println(i);
            System.out.println(result);
        }
        System.out.println(i);
    }
}
