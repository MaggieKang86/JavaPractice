public class Ch5_9 {

    public static void main(String[] args) {
        //while跟do while的差別在於：do while一定會執行一次，while不會 | 且do while結尾一定要加";"
        //很少使用do while
        int i = 100;
        do{
        System.out.println(i++);
        } while(i <= 10);

        while(i <= 10) {
            System.out.println(i);
        }



    }

}
