package com.henry.Dec12;

public class ObjectDemo01 {
    public static void main(String[] args) throws CloneNotSupportedException {

        int [] data= {1,2,3};
        User user1 =new User(1,"zhangsan","123456","asdfaew",data);

        User user2= (User) user1.clone();//由于clone方法返回的是super.clone()的结果，是Object类的对象，因此需要强转（User是Object的子类，不能直接接收）
        System.out.println(user2);


    }

}
