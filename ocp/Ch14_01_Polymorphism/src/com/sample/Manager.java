package com.sample;

public class Manager extends Employee {

    private String deptName;

    public Manager( String deptName, int empId, String name, String ssn, double salary) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}
