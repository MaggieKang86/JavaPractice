import java.util.Date;

public class Account {

    //宣告欄位(fields)，屬性
    //語法：[存取修飾]  型別  欄位名稱[=值]
    public String name;
    public int balance;
    private Date date;

    //建構子(constructors)：初始化物件，只能被執行一次
    //語法：[存取修飾] 類別名稱(參數列){...}
    public Account() {
        System.out.println("新帳戶建立...");
    }

    //方法(method)(操作、行為)
    //語法：[存取修飾] 回傳型別 方法名稱(參數列) {...}
    public void display() {
        //建立日期時間物件
        //物件建立語法：類別型別 參考名稱 = new 建構子();
        date = new Date();

        //宣告區域變數
        String msg = "帳號：" + name + "\n存款：" + balance + "\n" + "查詢日期" + date;
        System.out.println(msg);
    }
}
