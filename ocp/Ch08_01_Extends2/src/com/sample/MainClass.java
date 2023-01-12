package com.sample;

public class MainClass {

    public static void main(String[] args) {
        Magician magician = new Magician();
        magician.setName("哈利波特");
        magician.setLevel(10);
        magician.setBlood(100);
        System.out.printf("魔法師 [ %s, %d, %d ]%n", magician.getName(), magician.getLevel(), magician.getBlood());
        magician.cure();
        magician.fight();
        System.out.println("-------------");

        Soldier soldier = new Soldier();
        soldier.setName("雷恩大兵");
        soldier.setLevel(1);
        soldier.setBlood(100);
        System.out.printf("士兵 [ %s, %d, %d]%n", soldier.getName(), soldier.getLevel(), soldier.getBlood());
        soldier.fight();
        System.out.println("-------------");

        Role roleA = magician;
        Role roleB = soldier;

        // 多個型別相同，可使用陣列來操作
        Role[] roles = new Role[2];
        roles[0] = magician;
        roles[1] = soldier;
        for (Role r : roles) {
            System.out.printf("%s\t%d\t%d%n", r.getName(), r.getLevel(), r.getBlood());
        }
    }

}
