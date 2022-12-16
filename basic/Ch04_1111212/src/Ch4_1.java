
public class Ch4_1 {

    public static void main(String[] args) {
        // 比較運算值(true amd false)
        int a = 10, b = 5;
        System.out.printf("%d > %d = %b%n", a, b, a > b);
        System.out.printf("%d < %d = %b%n", a, b, a < b);
        System.out.printf("%d >= %d = %b%n", a, b, a >= b);
        System.out.printf("%d <= %d = %b%n", a, b, a <= b);

        // 是否相等是"=="
        System.out.printf("%d == %d = %b%n", a, b, a == b);

        // 是否不相等是"!="
        System.out.printf("%d != %d = %b%n", a, b, a != b);
    }

}
