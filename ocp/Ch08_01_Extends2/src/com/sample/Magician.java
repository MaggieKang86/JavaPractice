package com.sample;

public class Magician extends Role {

    /*
    private String name;
    private int level;
    private int blood;
    */

    public Magician() {
        System.out.println("新魔法師誕生....");
    }

    /*
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
     */

    public void cure() {
        System.out.printf("魔法師:%s 進行麻法治療%n", getName());
    }

    public void fight() {
        System.out.printf("魔法師:%s 進行魔法攻擊%n", getName());
    }

}
