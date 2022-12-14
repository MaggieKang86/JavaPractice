/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Ch4_2 {
    public static void main(String[] args){
        //邏輯運算(很常用)
        //且 &&  同時達到兩個條件
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 && b1);
        
        //或 ||  達到其一條件
        System.out.println(b2 || b1);

        //反向 !  唱反調(用來減少語法)
        System.out.println(b2==false);
        System.out.println(!b2);
        System.out.println(!b1);
        //反向值會先算
        System.out.println(!b2 && b1);  //!b2 = true 所以!b2 && b1 = true
        
        //且 與 或 會有短路現象 aka執行左邊後，就不會再執行右邊
        //無短路現象
        int i = 0;
        boolean b3 = i <1 && ++i > 0;  //++i=> i = i+1 = 1
        System.out.println(b3);  //true
        System.out.println(i);   //因為無短路，所以有執行到++i，故i = 1

        //短路現象  左邊為false且運算短路驅動
        int x = 0;
        b3 = x>1 && ++x > 0;  //++x=> x = x+1 = 1
        System.out.println(b3);
        System.out.println(x);   //因為短路，所以無執行到++x，故x依舊 = 0
        
        //左邊為true或運算則短路驅動
        int y = 0;
        b3 = y < 1 || ++y > 0; //y<1成立，所以往右執行 ++y => y = y+1 = 1
        System.out.println(b3); //true
        System.out.println(y);  //y = 0
        
        
        
    }
}
