package com.sample;

// 自訂類別若要放入 TreeSet 的集合內，需在自訂類別實作 Comparable 的介面
public class Book implements Comparable<Book> {

    private int id;
    private String name;
    private double price;

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + id + ", " + name + ", " + price + ']';
    }

    @Override
    public int compareTo(Book o) {
//        if(this.id - o.getId() > 0) {
//            return 1;
//        } else if (this.id == o.getId()) {
//            return 0;
//        } else {
//            return -1;
//        }

        // 照 id 排列
                    // boxing int->Integer
//        int result = new Integer(this.id).compareTo(o.getId());
//                                                  // autoboxing int -> Integer
//        return result;       // 資料小至大
//        // return result * -1;  // 資料大至小

        // 照書名排
//        int result = this.name.compareTo(o.getName());
//        return result;

        // 照價格牌
                    // 型別不同先裝箱
        int result = new Double(this.price).compareTo(o.getPrice());
        return result;

    }

}
