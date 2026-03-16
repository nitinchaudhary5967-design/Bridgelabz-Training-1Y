package com.gla.packagesQuestions.Q6.com.company.Main;

import com.gla.packagesQuestions.Q6.com.company.hr.Employee;
import com.gla.packagesQuestions.Q6.com.company.payroll.Payroll;

public class main{

    public static void main(String[] args){

        Employee e=new Employee(1,"Aniket","IT",50000);

        Payroll p=new Payroll();
        p.calculateBonus(e);

        e.display();

    }

}
