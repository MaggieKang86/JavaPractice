package com.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("A01", "小明");
        map.put("D03", "Amy");
        map.put("B07", "Tom");
        map.put("D01", "Jackie");
        map.put("C05", "小花");
        map.put("A01", "王大明");  //  Key 若相同。新 value 會取代舊 value
        System.out.println(map);

        // 取出資料  get(key)
        System.out.println(map.get("D03"));
        System.out.println(map.get("A03"));  // Key 若不存在，則回傳 null 值

        // 取出所有的 Key
        Set<String> keys = map.keySet();
        System.out.println("keys: " + keys);
        System.out.println();
        System.out.println("ID\tName");
        System.out.println("-----------");
        // 取出 map 中所有的資料
        for(String key : keys) {
            System.out.printf("%s\t%s%n", key, map.get(key));
        }

    }

}
