package com.sample;

import java.util.List;

public class MainClass {

    public static void main(String[] args) {

        List<Employee> eList = Employee.createShortList();

        double sum = 0;

        for(Employee e : eList) {
            if(e.getState().equals("CO") &&
               e.getRole().equals(Role.EXECUTIVE)) {
                sum += e.getSalary();
            }
        }

        System.out.printf("Total CO Executive Pay: $%,9.2f %n", sum);

    }

}
