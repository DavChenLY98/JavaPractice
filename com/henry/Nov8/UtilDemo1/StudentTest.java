package com.henry.Nov8.UtilDemo1;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1=new Student("David",25,"男");
        Student stu2=new Student("June",26,"女");
        Student stu3=new Student("Henry",27,"男");
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        System.out.println("学生中最大年龄为："+ StudentUtil.MaxAge(list));
    }
}
