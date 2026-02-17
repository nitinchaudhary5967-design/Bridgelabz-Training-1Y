package com.gla.classesAndobjects.level03;
import java.util.*;
public class EmployeeBonus{
    static int[][]generate(){
        int[][]a=new int[10][2];
        for(int i=0;i<10;i++){
            a[i][0]=(int)(Math.random()*90000)+10000;
            a[i][1]=(int)(Math.random()*11);
        }
        return a;
    }
    static double[][]calculate(int[][]a){
        double[][]b=new double[10][3];
        for(int i=0;i<10;i++){
            double salary=a[i][0];
            int years=a[i][1];
            double bonus=years>5?salary*0.05:salary*0.02;
            double newsal=salary+bonus;
            b[i][0]=salary;
            b[i][1]=bonus;
            b[i][2]=newsal;
        }
        return b;
    }
    static void totals(double[][]b){
        double oldsum=0,newsum=0,bonussum=0;
        System.out.println("OldSalary Bonus NewSalary");
        for(int i=0;i<10;i++){
            System.out.printf("%.0f %.0f %.0f\n",b[i][0],b[i][1],b[i][2]);
            oldsum+=b[i][0];
            bonussum+=b[i][1];
            newsum+=b[i][2];
        }
        System.out.println("TotalOld:"+oldsum);
        System.out.println("TotalBonus:"+bonussum);
        System.out.println("TotalNew:"+newsum);
    }
    public static void main(String[]args){
        int[][]data=generate();
        double[][]result=calculate(data);
        totals(result);
    }
}

