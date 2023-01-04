package com.sample;

public class MainClass {

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
        for (int i = 0; i < 3; i++) {  //i = 0, 1, 2
            System.out.println((i + 1) + "." + ages[i]);
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
        for (int i : iArray) {
            System.out.printf("%d | ", i);
        }
        System.out.println("\n------------------");

        // int[] test1 = new int[];           // 錯，沒有給記憶體空間  []裡面一定要給值
        int test2[] = new int[1];             // 對
        int []test3 = new int[2];             // 對
        // int[] test4 = new int[2] {1, 2};   // 錯，後方{}已有給資料，[]不須再給陣列空間
        int[] test4 = new int[] {1, 2};       // 對
        int[] test5 = new int[] {1, 2, 3};    // 對
        int[] test6;
        // test6 = {1, 2, 3};                 // 錯，不可將陣列宣告分開寫
        test6 = new int[] {1, 2, 3};
        int[] test7 = new int[] {};           // 對，同int[] = new int[0];

        //-----------------------------------------------

        // 用Book型別宣告陣列
        Book[] books = new Book[3];
        System.out.println("books[0]：" + books[0]);

        // 設值
        books[0] = new Book("Java SE 8", 800);
        books[1] = new Book("Python 3.9", 700);
        books[2] = new Book("Android 10", 750);

        // 取物件：增強型 for 迴圈
        // for(型別 暫時性變數：陣列或集合) {...}
        for (Book book : books) {
            System.out.println(book.name + "\t" + book.price);
        }
        System.out.println("-------------------------");

        // 多維陣列
        int [] [] ids = {{11, 12}, {21, 22}, {31, 32}};

        // 取值
        System.out.println("ids[1][0]：" + ids[1][0]);
        System.out.println("ids[2][1]：" + ids[2][1]);
        System.out.println("-------------------------");

        // 巢狀迴圈帶出所有值
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.printf("%d ", ids[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------");

        // 增強型迴圈
        for(int[] temp : ids) {
            for(int i : temp) {
                System.out.printf("%d " , i);
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        int [] [] b = {{11, 12, 13}, {21, 22}, {31, 32, 33, 34}};
        for( int i = 0; i < b.length; i++) {
            for( int j = 0; j < b[i].length; j++) {
                System.out.printf("%d ", b[i][j]);
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        // 宣告陣列長度：當陣列長度相同時
        String[][] test8 = new String[3][2];

        // 宣告陣列長度：當陣列長度不相同時
        String[][] test9 = new String[3][];
        test9[0] = new String[3];
        test9[1] = new String[]["Lisa", "Tom"];
        test9[2] = new String[5];


    }

}
