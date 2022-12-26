/**
 * @author maggie
 */
public class Ch3_3 {

    public static void main(String[] args) {
        System.out.println("Howard");
        System.out.println("Ken");
        System.out.println("Maggie");
        System.out.println("Helen");
        //若只有print 後面就不會斷行,或可撰寫成下方樣式
        System.out.print("Maggie\n");
        System.out.print("Helen\n");
        System.out.print("Luka\n");
        System.out.print("Ricky ");

        //字串串接
        String title = "Age:";
        System.out.println(title + 16);
        //練習
        String name = "Ken";
        int age = 10;
        double height = 123.45;
        //我是Ken今年10歲身高123.45公分
        System.out.println("我是" + name + "今年" + age + "歲身高" + height + "公分");
        //printf
        System.out.printf("我是%s今年%d歲身高%.2f公分%n", name, age, height);
    }

}
