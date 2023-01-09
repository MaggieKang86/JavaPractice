import java.time.Instant;

public class MainClass {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.calculate(5, 3);
        System.out.println("\u6A94\u540D\u683C\u5F0F\u4E0D\u7B26");
        System.out.println(Instant.now());
    }

    private void calculate(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
}
