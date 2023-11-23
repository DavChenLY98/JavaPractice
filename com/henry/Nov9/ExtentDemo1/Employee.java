package com.henry.Nov9.ExtentDemo1;

public class Employee {
    private String name;
    private String id;
    private int salary;

    public Employee() {

    }

    public Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void work() {
        System.out.println("工作");
    }

    public void eat() {
        System.out.println("吃米饭");
    }

}
