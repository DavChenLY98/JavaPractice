package com.henry.Oct31;

public class Item {
    private String ID;
    private String name;
    private double value;
    private int number;

    public Item() {
    }

    public Item(String ID, String name, double value, int number) {
        this.ID=ID;
        this.name=name;
        this.value =value;
        this.number=number;
    }

    public void setID(String ID){
    this.ID=ID;
    }

    public String getID(){
        return ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
