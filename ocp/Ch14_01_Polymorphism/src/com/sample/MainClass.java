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
        System.out.println("-------------");

        // 不可以轉型的操作  父類別建立的物件，不可向下轉型給子類別
        // Director directorD = (Director)managerA;  // ClassCastException
        // directorD.getBudget();

        // Engineer跟manager兩者無直接關係
        // Engineer engineerE = managerA;            // 編譯失敗
        // Engineer engineerE = (Engineer)managerA;  // 編譯失敗

        // Engineer engineerE = (Engineer)employeeB; // ClassCastException
        //-------------------------------

        Employee employee = new Employee(2, "Tom", "234-56-7891", 360000);
        Manager manager = new Manager("行銷", 1, "Amy", "123-45-6789", 50000);
        Director director = new Director(100000, "企劃", 3, "jackie", "345-67-8912", 40000);
        Engineer engineer = new Engineer(4, "小明", "45-678-9123", 46000);

        display(employee);
        display(manager);
        display(director);
        display(engineer);
        System.out.println("-------------");


        Employee[] employees = new Employee[4];
        employees[0] = new Employee(2, "Tom", "234-56-7891", 360000);
        employees[1] = new Manager("行銷", 1, "Amy", "123-45-6789", 50000);
        employees[2] = new Director(100000, "企劃", 3, "Jackie", "345-67-8912", 40000);
        employees[3] = new Engineer(4, "小明", "45-678-9123", 46000);

        for(Employee e : employees) {
            display(e);
        }

        System.out.println("--------------");

        Employee e = new Director(100000, "企劃", 3, "Jackie", "345-67-8912", 40000);
//        Manager m = (Manager)e;
//        Engineer en = (Engineer)e;

        // 轉型前先檢查
        if(e instanceof Manager) {
            System.out.println("e to Manager   --> OK");
            Manager m = (Manager) e;
        } else {
            System.out.println("e to Manager  --> ERROR ");
        }

        if(e instanceof Engineer) {
            System.out.println("e to Engineer --> OK");
            Engineer en = (Engineer) e;
        }
        System.out.println("e to Engineer --> ERROR");

    }

    private static void display(Employee e) {
        System.out.printf("%d\t%s\t%.2f%n", e.getEmpId(), e.getName(), e.getSalary());
    }

}
