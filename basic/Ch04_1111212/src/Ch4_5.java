import java.util.Scanner;

public class Ch4_5 {
    
    public static void main(String[] args){
        /*System.out.println("請輸入年齡：");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age >= 18){
            System.out.println("成年!");
        }else{
            System.out.println("未成年!");
        }*/
        
        System.out.println("請輸入密碼：");
        Scanner scan = new Scanner(System.in);
        int pass = scan.nextInt();
        //假設密碼是：12345
        //pass 輸入的是正確的密碼  顯示登入成功
        //錯誤的 就顯示登入失敗
        if(pass == 12345){
            System.out.println("登入成功");
        }else{
            System.out.println("登入失敗");
        }
        
        //運算子
        //三元運算值：第一元?第二元:第三元        
        String msg = pass==12345?"登入成功":"登入失敗";
        System.out.println(msg);
        
        int n1 = -10;
        int n2 = 26;
        int ans = n2 + (n1 < 0 ?n1*-1:n1);  //n1 < 0 ?n1*-1:n1 aka如果n1<0，則把n1*-1，否則直接把n1回傳
        System.out.println(ans);
        
    }
}
