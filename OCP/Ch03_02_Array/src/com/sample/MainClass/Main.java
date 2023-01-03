public class Main {

    public static void main(String[] args) {

        // 宣告、實作、初始化一維陣列
        // 型別[] 陣列名稱 = {元素1, 元素2, ...};

        int[] ages = {25, 27, 48};
        System.out.println("ages：" + ages);

        // 取值：陣列名稱[索引值index]
        System.out.println("1." + ages[0]);
        System.out.println("2." + ages[1]);
        System.out.println("3." + ages[2]);
        System.out.println("------------------");

        // 修改、設值：陣列名稱[索引值index] = 值
        ages[1] = 30;

        // 使用一般 for 迴圈制定規則將所有陣列內的東西印出來，就不用一直print
        for(int i=0; i<3; i++){  //i = 0, 1, 2
        System.out.println((i+1) + "." + ages[i]);
        }
        System.out.println("------------------");

        // 宣告、實作一維陣列
        // 宣告一維陣列：型別[] 陣列名稱;
        // 實作一維陣列：陣列名稱 = new 型別[陣列長度];  (陣列長度一定要寫，宣告後陣列長度不可更改)
        // -------------------------------------
        // 宣告、實作一維陣列：型別[] 陣列名稱 = new 型別[陣列長度]
        // -------------------------------------
        int[] iArray = new int[5];
        /*
          陣列宣告後會給預設值：
          基本型別：
          byte、short、int、long ---> 0
          float、double ---> 0.0
          char ---> '\u0000'
          boolean ---> false
          參考型別：
          String、Date、...類別 ---> null
        */
        iArray[1] = 20;
        iArray[3] = 40;

        // 增強型 for 迴圈
        // for(型別 暫時性變數：陣列或集合) {...}
        for(int i : iArray) {
        System.out.printf("%d | ", i);
        }
        System.out.println("\n------------------");







    }
}
