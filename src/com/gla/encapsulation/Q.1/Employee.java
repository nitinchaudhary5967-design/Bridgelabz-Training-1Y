package com.gla.encapsulation.Q1.company.employee;

public abstract class  Employee {
     private int employeeID;
     private String name;
     private double basesalary;
     public Employee(int id ,String name,double salary){
         this.employeeID=id;
         this.name=name;
         this.basesalary=salary;
     }
     public  int getEmployeeID(){
         return employeeID;
     }
     public String getname(){
     return name;
     }
     public double getBasesalary(){
         return basesalary;
     }
     public void setBasesalary(double salary){
         this.basesalary=salary;
     }
     public abstract double calculateSalary();
     public void display(){
         System.out.println("ID:"+employeeID);
         System.out.println("Name:"+name);
         System.out.println("Salry:"+calculateSalary());
     }
}
