package com.henry.Dec17;

public class test {
    public static void main(String[] args) {
        int[] nums ={0,3,10};
        int val=0;
        for(val=0;val<nums.length;val++){
            if(nums[val]>=0) break;
        }
        System.out.println(val);
    }
}
