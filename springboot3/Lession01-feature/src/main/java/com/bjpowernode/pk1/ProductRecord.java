package com.bjpowernode.pk1;

import java.util.StringJoiner;

public record ProductRecord(Integer id, String name, Integer qty) implements PrintInterface {

    @Override
    public void print() {
        StringJoiner joiner = new StringJoiner("-");
        String s = joiner.add(id.toString()).add(name).add(qty.toString()).toString();
        System.out.println("商品訊息：" + s);
    }

}
