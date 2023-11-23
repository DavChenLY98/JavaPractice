package com.henry.Oct31;

import java.util.Random;

public class Role {
    private String name;
    private int blood;


    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public int getBlood() {
        return blood;
    }


    //定义一个方法用于攻击别人
    //思考：谁攻击谁？在创建好两个对象后，是用其中一个调用攻击方法，将被攻击对象作为参数输入给方法。

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int tempblood = role.getBlood() - hurt;
        tempblood = tempblood < 0 ? 0 : tempblood;
        role.setBlood(tempblood);
        System.out.println(this.getName() + "攻击了" + role.getName() + "造成了" + hurt + "点伤害,"
                + role.getName() + "还剩" + tempblood + "点血量");
    }


}