package com.gla.encapsulation.Q1.company.employee;

public class Main {
    static void main(String[] args) {
        Employee e1=new FullTimeEmployee(1,"Aniket",500000);
        Employee e2=new PartTimeEmployee(2,"Mayank",500,20);
        Department d1=(Department)e1;
        Department d2=(Department)e2;
        d1.assignDepartment("IT");
        d2.assignDepartment("Support");
        Employee[] employees={e1,e2};
        for(Employee e:employees){
            e.display();
            System.out.println("Department:"+((Department)e).getDepartmentDetails());
            System.out.println();
        }
        }
    }


