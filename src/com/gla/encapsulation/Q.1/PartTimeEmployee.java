package com.gla.encapsulation.Q1.company.employee;

public class PartTimeEmployee extends Employee implements Department{
    private int hoursworked;
    private double hourlyrate;
    private String department;

    public PartTimeEmployee(int id, String name, double rate,int hours) {
        super(id, name, 0);
        hourlyrate=rate;
        hoursworked=hours;
    }


    @Override
    public void assignDepartment(String dept) {
      department=dept;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }

    @Override
    public double calculateSalary() {
        return hoursworked*hourlyrate;
    }
}
