import java.util.Random;
import java.util.Scanner;
public class Ch5_8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int pc = random.nextInt(100) +1;
        System.out.print(pc);

        int min = 1 ,max = 100;
        while(true) {
        System.out.printf("請輸入您要猜的數字%d~%d：" ,min,max);
        int input = scan.nextInt();
        if (input == pc) {
        System.out.println("您猜對了！");
        break;
        } else if(input > pc) {
            max = input;
        } else {
            min = input;

        }
        }
    }
}
