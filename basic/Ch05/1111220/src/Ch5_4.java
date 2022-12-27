/**
 * @author maggie
 */
public class Ch5_4 {

    public static void main(String[] args) {
        // 巢狀迴圈
        for (int i = 1; i <= 9; i++) {
            for (int x = 1; x <= 9; x++) {
                System.out.printf("%d * %d = %02d ", i, x, i * x);
            }
            System.out.println();
        }
    }

}