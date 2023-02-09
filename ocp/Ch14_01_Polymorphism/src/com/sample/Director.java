package com.sample;

public class Director extends Manager {

    private double budget;

    public Director(int empId, String name, String ssn, double salary, String deptName, double budget) {
        super(name, empId, ssn, deptName, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}
