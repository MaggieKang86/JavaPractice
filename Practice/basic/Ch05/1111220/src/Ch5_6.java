/**
 * @author maggie
 */
public class Ch5_6 {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Start:" + i);
            if (i == 3) {
                break;
            }
            for (int k = 1; k <= 3; k++) {
                System.out.printf("Body %d_%d", k, i);
            }
            System.out.println();
            System.out.println("End:" + i);
        }
    }

}
