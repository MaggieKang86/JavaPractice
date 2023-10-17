package com.bjpowernode.pk1;

public class SomeService {

    // 定義業務方法，判斷年齡是否18
    public boolean isEligible(Object obj){
        /*
        if(obj instanceof Person(String name, Integer age)){
            return age >= 18;
        }
        */

        if (obj instanceof Person(String name, Integer age) p){
            return p.age() >= 18;
        }
        return false;
    }

}
