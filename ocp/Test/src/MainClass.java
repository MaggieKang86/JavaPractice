public class MainClass {

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.calculate(5, 3);
        System.out.println("end");
    }

    private void calculate(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }
}
