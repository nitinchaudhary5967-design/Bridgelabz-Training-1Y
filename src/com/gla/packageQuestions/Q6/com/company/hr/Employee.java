package com.gla.packagesQuestions.Q6.com.company.hr;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id,String name,String d,double s){
        this.id=id;
        this.name=name;
        department=d;
        salary=s;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double s){
        salary=s;
    }
    public String getName(){
        return name;
    }
    public void display(){
        System.out.println(id+" "+name+" "+department+" "+salary);
    }
}

