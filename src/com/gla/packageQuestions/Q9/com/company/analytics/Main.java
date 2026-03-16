package com.gla.packagesQuestions.Q9.com.company.analytics;
import com.gla.packagesQuestions.Q9.com.company.analytics.hr.EmployeeReport;
import com.gla.packagesQuestions.Q9.com.company.analytics.sales.SalesReport;
public class Main {
    public static void main(String[] args){
        SalesReport s=new SalesReport();
        EmployeeReport e=new EmployeeReport();
        s.report();
        e.report();
    }
}
