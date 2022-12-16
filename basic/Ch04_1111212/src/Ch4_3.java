
public class Ch4_3 {

    public static void main(String[] args) {
        // 轉型
        int g1 = 20;  // 32位元
        byte b2 = 12; // 8位元
        g1 = b2;      // 小的單位往大的單位放是可行的
        /* b2 = g1;   // 不可行，故須強制轉型如下 基本上不會用 */
        b2 = (byte) g1;
        System.out.println(b2);

        // 無條件捨去
        float f3 = 125.678f;
        f3 = (int) f3;
        System.out.println(f3);
        System.out.printf("%3.0f%n", f3);
    }

}
