/**
 * @author maggie
 */
public class Ch5_2 {

    public static void main(String[] args) {
        // if vs if else if
        int age = 25;
        // 第一種
        if (age >= 18) {
            System.out.println("1成年");
        }

        if (age < 18) {
            System.out.println("1未成年");
        }

        //第二種
        if (age >= 18) {
            System.out.println("2成年");
        } else {
            System.out.println("2未成年");
        }

        // 迴圈(三種)
        // for / while / do while

        // for (宣告或初始化;中間若為true則繼續迴圈;累加or累減)
        /*
        for (int i = 1; i <= 10; i++){
            System.out.println(i + "gogo!");
        }
        */

        // 求當中所有偶數的加總
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);
        // sum = 2
        // sum = 6(2 + 4)
        // sum = 12(6 + 6)
        // sum = 20(12 + 8)
        // sum = 30(20 + 10)
        // 最終i變成11
    }

}
