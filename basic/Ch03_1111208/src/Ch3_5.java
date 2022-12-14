/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Ch3_5 {
    public static void main(String[] args){
        int a1 = 19,b2 = 5;
        System.out.printf("%d + %d = %d%n",a1,b2,a1 + b2);
        System.out.printf("%d - %d = %d%n",a1,b2,a1 - b2);
        System.out.printf("%d * %d = %d%n",a1,b2,a1 * b2);
        //求商數
        System.out.printf("%d / %d = %d%n",a1,b2,a1 / b2);
        //求餘數
        System.out.printf("%d %% %d = %d%n",a1,b2,a1 % b2);
        
        //算式當中其中一組是浮點數類型的 計算結果就是浮點數
        float maxHp = 100;
        int hp = 90;
        float bar = hp / maxHp;
        System.out.println(bar*100);

    }
    
}
