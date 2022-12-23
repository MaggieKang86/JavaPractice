/**
 * @author maggie
 */
public class Ch3_6 {

    public static void main(String[] args) {
        // 加1
        /*
        // 單獨存在count++ 與 ++count 一樣
        int count = 0;
        count++;   // count++  => count = count + 1
        System.out.println(count);  // 1
        ++count;   // ++count  => count = count + 1
        System.out.println(count);
        */

        int i = 0;
        System.out.println(i++);   // i++ => i = i + 1
        int c = 0;
        System.out.println(++c);

        //複合指定運算
        int k = 2;
        /*
        k++;  // k + 1
        System.out.println(k++);
        */
        k += 5;  // k+5
        System.out.println(k);
        k -= 3;  // k = k - 3
        System.out.println(k);

        // System.out.println(i);
        // i++;
        // System.out.println(i);
    }

}
