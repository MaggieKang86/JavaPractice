package com.sample;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.List;
import java.util.Optional;

public class StreamsAreDeterministic {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();
        double result1 = eList.stream()
                              .filter(e -> e.getState().equals("CO"))
                              .mapToDouble(Employee::getSalary)
                              .sequential()
                              .sum();
        double result2 = eList.stream()
                              .filter(e -> e.getState().equals("CO"))
                              .mapToDouble(Employee::getSalary)
                              .parallel()
                              .sum();
        System.out.println("The same: " + (result1 == result2));

        System.out.println("------------------------------");

        Optional<Employee> o1 = eList.stream()
                                     .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                                     .sequential()
                                     .findAny();

        Optional<Employee> o2 = eList.stream()
                                     .filter(e -> e.getRole().equals(Role.EXECUTIVE))
                                     .parallel()
                                     .findAny();
        System.out.println(o1.get().getEmail() + "\t" + o2.get().getEmail() + "\t" + o1.get().getEmail().equals(o2.get().getEmail()));

    }

}
