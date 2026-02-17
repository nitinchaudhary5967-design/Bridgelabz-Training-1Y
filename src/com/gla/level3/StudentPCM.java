package com.gla.classesAndobjects.level03;
import java.util.*;
public class StudentPCM{
    static int[][]generate(int n){
        int[][]a=new int[n][3];
        for(int i=0;i<n;i++)
            for(int j=0;j<3;j++)
                a[i][j]=(int)(Math.random()*90)+10;
        return a;
    }
    static double[][]calculate(int[][]a){
        int n=a.length;
        double[][]b=new double[n][3];
        for(int i=0;i<n;i++){
            int total=a[i][0]+a[i][1]+a[i][2];
            double avg=total/3.0;
            double per=(total/300.0)*100;
            avg=Math.round(avg*100.0)/100.0;
            per=Math.round(per*100.0)/100.0;
            b[i][0]=total;
            b[i][1]=avg;
            b[i][2]=per;
        }
        return b;
    }
    static String grade(double p){
        if(p>=80)
            return "A";
        else if(p>=70)
            return "B";
        else if(p>=60)
            return "C";
        else if(p>=50)
            return "D";
        else if(p>=40)
            return "E";
        else
            return "R";
    }
    static void display(int[][]a,double[][]b){
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
        for(int i=0;i<a.length;i++)
            System.out.println(a[i][0]+"\t"+a[i][1]+"\t"+a[i][2]+"\t"+(int)b[i][0]+"\t"+b[i][1]+"\t"+b[i][2]+"\t"+grade(b[i][2]));
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]marks=generate(n);
        double[][]result=calculate(marks);
        display(marks,result);
    }
}

