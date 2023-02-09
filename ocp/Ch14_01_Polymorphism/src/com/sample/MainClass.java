package com.sample;

public class MainClass {

    public static void main(String[] args) {

        Manager managerA = new Manager("行銷", 1, "Lisa", "123-45-6789", 50000);
        System.out.printf("managerA[%s, %d, %s, %s, %.2f]%n", managerA.getDeptName(), managerA.getEmpId(), managerA.getName(), managerA.getSsn(), managerA.getSalary());

        // 子 -> 父 向上轉型
        Employee employeeB = managerA;
        System.out.printf("employeeB[%d, %s, %s, %.2f]%n", employeeB.getEmpId(), employeeB.getName(), employeeB.getSsn(), employeeB.getSalary());

        // ManagerC managerC = employeeB;  // employeeB 父類別不可交給 ManagerC 子類別
        // 父 -> 子 強迫轉型: (目標轉型)值
        Manager managerC = (Manager) employeeB;
        System.out.printf("managerC[%s, %d, %s, %s, %.2f]%n", managerC.getDeptName(), managerC.getEmpId(), managerC.getName(), managerC.getSsn(), managerC.getSalary());





    }

}
