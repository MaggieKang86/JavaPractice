import java.util.Scanner;

public class Ch4_4 {

    public static void main(String[] args) {
        //new 創造物件
        /*Scanner scan = new Scanner(System.in);
        System.out.println("請輸入數字:");
        int v = scan.nextInt();  //等待輸入
        System.out.println("v:"+v);*/

        //輸入兩個數值
        /*Scanner scan = new Scanner(System.in);
        System.out.println("請輸入兩個數字並用空白隔開:");
        double d1 = scan.nextDouble();  //等待輸入
        double d2 = scan.nextDouble();  //等待輸入
        System.out.println(d1+":"+d2);*/

        /*Scanner scan = new Scanner(System.in);
        System.out.println("請輸入帳號:");
        String g1 = scan.next();  //等待輸入
        System.out.println("帳號:" + g1);*/
        
        Scanner scan = new Scanner(System.in);
        System.out.println("請輸入訊息：");
        //使用enter斷行做分割
        String msg = scan.nextLine();
        System.out.println("msg:"+msg);
        
    }

}
