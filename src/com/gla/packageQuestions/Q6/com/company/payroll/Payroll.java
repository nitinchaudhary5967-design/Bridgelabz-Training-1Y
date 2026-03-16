package com.gla.packagesQuestions.Q6.com.company.payroll;

import com.gla.packagesQuestions.Q6.com.company.hr.Employee;

public class Payroll {
    public void calculateBonus(Employee e){
        double s=e.getSalary();
        e.setSalary(s+(s*0.1));
    }
}

