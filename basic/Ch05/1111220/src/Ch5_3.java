/**
 * @author maggie
 */
public class Ch5_3 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Start:" + i);
            if (i == 3) {
                // break; //離開迴圈
                continue; //不往下運行
            }
            System.out.println("End:" + i);
        }
    }

}
