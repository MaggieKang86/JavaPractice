package com.sample;

public class P06 {

    static int count = 0;
    int i = 0;

    public void changeCount() {
        while(i < 5) {
            i++;
            count++;
        }
    }

    public static void main(String[] args) {

       P06 check1 = new P06();
       P06 check2 = new P06();
       check1.changeCount();
       check2.changeCount();
       System.out.print(check1.count + " : " + check2.count);

    }

}
