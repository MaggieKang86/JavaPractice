package com.sample;

import java.util.List;

public class UseingParallelStreams {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        // 用 Collection 物件啟動做平行化處理
        double result = eList.parallelStream()
                .filter(e -> e.getState().equals("CO"))
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .peek(e -> e.printSummary())
                .mapToDouble(e -> e.getSalary())
                .sum();
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result);

        // From a Stream
        double result2 = eList.stream()
                .filter(e -> e.getState().equals("CO"))
                .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                .peek(e -> e.printSummary())
                .mapToDouble(e -> e.getSalary())
                .parallel()     // 一定要寫在中間操作後，這樣才知道前面動作要以平行化處理
                .sum();
        System.out.printf("Total CO Executive Pay: $%,9.2f %n", result2);

    }

}
