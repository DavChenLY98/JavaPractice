package com.henry.Nov6;

public class StringRotation {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="cdeab";
        System.out.println(IfRotationString(str1,str2));
    }
    public static boolean IfRotationString(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            if(str1.equals(str2)){
               return true;
            }else{
                StringBuilder sb=new StringBuilder();
                String str_temp = str1.substring(1,str1.length());
                sb.append(str_temp);
                sb.append(str1.substring(0,1));
                str1=sb.toString();
            }

        }
        return false;
    }
}
