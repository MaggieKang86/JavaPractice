package com.sample;

public class Soldier extends Role{

    /*
    private String name;
    private int level;
    private int blood;
     */

    public Soldier() {
        System.out.println("新士兵誕生...");
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

    public void fight() {
        System.out.printf("士兵:%s 進行火炮攻擊%n", getName());
    }


}
