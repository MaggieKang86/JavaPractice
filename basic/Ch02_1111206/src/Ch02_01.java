
public class Ch02_01 {
    //bit 01
    //2bit
    //byte 8bit   -128~127
    //short  16bit -32768~32767
    //int  32bit  -2147483648~2147483647
    //long  64bit
    public static void main(String[] args) {
        //;表示一段命令結束
        int height = 180;
        int $_Weight = 75;
        //避免使用"小寫l" 會和阿拉伯數字1搞混
        //int value 1 = 83;
        int var1 = 83;
        String 姓名 = "Ken";

        //不可重複宣告(可重複給值 但能不能成立就另當別論)
        int length;//宣告
        length = 10;//給值
        System.out.println(length);
        System.out.println(Long.MAX_VALUE);
        byte age = 25;
        age = 78;
        long myLong = 2147483648L;
        System.out.println(myLong);
        //
        int b1 = 0b11001110;//二進位
        System.out.println(b1);
        int oct = 0316;//八進位
        System.out.println(oct);

        //十六進位
        // A=10 B=11 C=12 D=13 E=14 F=15
        int hex = 0xFF00A0;
        System.out.println(hex);

        //浮點數
        //double為預設 使用float時，須在最後加"f"
        double e = 2.71828;
        System.out.println(e);
        float pi = 3.71828f;
        System.out.println(pi);
        double f1 = 2.12345678912345678;
        float f2 = 2.1234567891234567f;
        System.out.println(f1);
        System.out.println(f2);

        //字面直底線符號_(底線)用於程式撰寫階段讓字面直容易閱讀，程式編譯時會將底線去除
        //底線前後必須是數字或底線
        int n1 = 0b1100_0110_0000__1000;
        int n2 = 0_7_21_32;
        float n3 = 123__45_67f;
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

}
 