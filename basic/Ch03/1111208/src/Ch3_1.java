/**
 * @author maggie
 */
public class Ch3_1 {

    public static void main(String[] args) {
        //字元對應數值大小：數字<英文大寫<英文小寫<中文
        char c1 = 'B';
        char c2 = 'A';
        char c3 = '1';
        char c4 = 'Z';
        char c5 = 'a';
        char c6 = '秋';
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(1);
        int c3map = c3, c2map = c2,
                c1map = c1, c4map = c4,
                c5map = c5, c6map = c6;
        System.out.println(c3map);
        System.out.println(c1map);
        System.out.println(c2map);
        System.out.println(c4map);
        System.out.println(c5map);
        System.out.println(c6map);

        //使用unicode編碼 16進制
        char c7 = '\u79CB';
        System.out.println(c7);
    }

}
