package com.gla.encapsulation.Q1.company.employee;

public class FullTimeEmployee extends Employee implements Department{
    private String department;
    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    @Override
    public double calculateSalary() {
        return getBasesalary();
    }
    @Override
    public void assignDepartment(String dept) {
        department = dept;
    }
    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
