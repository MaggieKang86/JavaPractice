import java.time.Instant;

public class MainClass {

    public static void main(String[] args) {
        doTest(10);
        System.out.println("\n------------------------");
    }

    private void calculate(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    private static void doTest(int i) {
//        System.out.println("1. i = " + i);
        if (i <= 1) {
            System.out.println();
            return;
        } else {
            doTest(i -1);
        }
        System.out.println("i = " + i);
    }

}
