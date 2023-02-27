package com.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class MainClass {

    public static void main(String[] args) {

        // Stream 建立方式 Arrays.asList()
        Stream<Integer> st1 = Arrays.asList(1, 2, 3, 4, 5).stream();
        System.out.println("st1: " + st1);

        // forEach() 終端操作取出 Stream 資料
        st1.forEach(i -> System.out.println(i*10 + " "));      // 1.執行後，st1 內容已取出
        System.out.println("------------");
        // st1.forEach(i -> System.out.println(i*100 + " "));  // 2.錯誤，因為 st1 內容是空的

        st1 = Arrays.asList(2, 4, 6, 8).stream();
        st1.forEach(i -> System.out.println(i*100 + " "));
        System.out.println("------------");

        // Stream 建立方式 Stream.of()
        Stream<String> st2 = Stream.of("A", "B", "C");
        st2.forEach(System.out::print);
        System.out.println("\n------------");

        // Stream 建立方式 Arrays.stream()
        Stream<Double> st3 = Arrays.stream(new Double[] {1.1, 2.2, 3.3});
        st3.forEach(d -> System.out.printf("%.2f | ", d));
        System.out.println("\n------------");

        DoubleStream st4 = Arrays.stream(new double[] {1.1, 2.2, 3.3});
        st4.forEach(d -> System.out.printf("%.2f | ", d));
        System.out.println("\n------------");

        // 應用
        Stream.of("A1", "B2", "C3")
              .map(s -> s.substring(1))
              .mapToInt(s -> Integer.parseInt(s))
              .forEach(i -> System.out.printf("%d | ", i));
        System.out.println("\n------------");

        int sum_1 = Stream.of("A1", "B2", "C3")
                         .map(s -> s.substring(1))
                         .mapToInt(Integer::parseInt)
                         .sum();
        System.out.println("sum_1: " + sum_1);
        System.out.println("------------");

        Stream<String> st5 = Stream.of("java", "python", "mysql", "c", "android", "php", "c++")
                                   .peek(s -> System.out.printf("1. %s%n", s))   // peek() 窺視
                                   .filter(s -> s.length() > 3)
                                   .peek(s -> System.out.printf("2. %s%n", s))   // peek() 窺視
                                   .map(String::toUpperCase)
                                   .peek(s -> System.out.printf("3. %s%n", s));  // peek() 窺視
        System.out.println("st5:" + st5);

        // st5.forEach(s -> System.out.printf("4. %s%n", s));

        // System.out.println("符合資料個數：" + st5.count());  // count() 回傳成員個數，型別 long
        List<String> strList = st5.collect(Collectors.toList());
        System.out.println("strList: " + strList);
        System.out.println("------------");

        int sum_2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).mapToInt(i -> i).sum();
        System.out.println("sum_2: " + sum_2);

        double sum_3 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8 ,9).mapToDouble(i -> i).sum();
        System.out.println("sum_3: " + sum_3);

        double average = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                               .mapToInt(i -> i)
                               .average()         // 終端操作 OptionalDouble
                               .getAsDouble();    // 取出 OptionalDouble 資料
        System.out.println("average: " + average);

        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
              .mapToInt(i -> i)
              .average()
              .ifPresent(d -> System.out.printf("average: %.1f%n", d));

        int max = Stream.of(2, 4, 6, 8, 9, 7, 5, 3, 1)
                        .mapToInt(i -> i)
                        .max()
                        .getAsInt();
        System.out.println("max: " + max);

        int min = Stream.of(2, 4, 6, 8, 9, 7, 5, 3, 1)
                        .mapToInt(i -> i)
                        .min()
                        .getAsInt();
        System.out.println("min: " + min);
        System.out.println("------------");

        List<String> list = Arrays.asList("java", "python", "mysql", "c", "android", "php", "c++");
        System.out.println("排序前: " + list);

        System.out.println("自然排序(小至大): ");
        list.stream()
            .sorted()
            .forEach(s -> System.out.printf("%s | ", s));
        System.out.println();

        System.out.println("自訂排序: ");
        list.stream()
            .sorted((s1, s2) -> s1.compareTo(s2) * -1)
            .forEach(s -> System.out.printf("%s | ", s));
        System.out.println("\n排序後: " + list);
        System.out.println("------------");

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Java SE 8", 800));
        bookList.add(new Book("Python 3.8", 600));
        bookList.add(new Book("Android 10", 750));
        bookList.add(new Book("Java EE 7", 800));
        bookList.add(new Book("MySQL", 600));

        // 定義多重排序規則
        Comparator<Book> compBook = Comparator.comparing(Book::getPrice)       // 先比較價格
                                              .thenComparing(Book::getName);   // 再比較書名

        bookList.stream()
                .sorted(compBook)
                .forEach(System.out::println);
        System.out.println("------------");

        // 攤平
        List<String> listA = Arrays.asList("A1", "A2", "A3");
        List<String> listB = Arrays.asList("B1", "B2", "B3");
        List<String> listC = Arrays.asList("C1", "C2", "C3");
        List<String> listD = Arrays.asList("D1", "D2", "D3");

        List<List<String>> listAll = new ArrayList<>();
        listAll.add(listA);
        listAll.add(listB);
        listAll.add(listC);
        listAll.add(listD);
        System.out.println(listAll);

        // 方法一
        List<String> list_1 = new ArrayList<>();
        for(List<String> temp : listAll) {
            for(String s : temp) {
                list_1.add(s);
            }
        }
        System.out.println("list_1: " + list_1);

        // 方法二
        List<String> list_2 = listAll.stream()
                                     .peek(l -> System.out.println("1. " + l))
                                     .flatMap(l -> l.stream())
                                     .peek(l -> System.out.println("2. " + l))
                                     .collect(Collectors.toList());
        System.out.println("list_2: " + list_2);

    }

}
