import java.util.Random;

public class MainClass {

    public static void main(String[] args) {

        doTest(6);
        doTest(7);
        doTest(8);
        doTest(0);
        System.out.println("main() 0%3=" + (0%3));
//        doTest(-7);
//        System.out.println("main() -7%3=" + (-7%3));
    }

    private static void doTest(int i) {

        i *= new Random().nextInt(100);
        assert i >= 0 : i + " 小於0";

        // assert (i *= new Random().nextInt(100)) >= 0 : i + " 小於0";

        if(i % 3 == 0) {
            System.out.printf("%d %% 3 = 0%n", i);
        } else if (i % 3 == 1) {
            System.out.printf("%d %% 3 = 1%n", i);
        } else {
            System.out.printf("%d %% 3 = 2%n", i);
        }

    }

}
