package com.gla.classesAndobjects.level02;
import java.util.Scanner;
class BMI{
    public static double calculateBMI(double w,double h){
        double m=h/100;
        return w/(m*m);
    }
    public static String getStatus(double bmi){
        if(bmi<18.4)
            return"Underweight";
        if(bmi<=24.9)
            return"Normal";
        if(bmi<=39.9)
            return"Overweight";
        return"Obese";
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double[][]a=new double[10][3];
        String[]status=new String[10];
        for(int i=0;i<10;i++){
            a[i][0]=sc.nextDouble();
            a[i][1]=sc.nextDouble();
            a[i][2]=calculateBMI(a[i][0],a[i][1]);
            status[i]=getStatus(a[i][2]);
        }
        for(int i=0;i<10;i++){
            System.out.println("Weight "+a[i][0]+" Height "+a[i][1]+" BMI "+a[i][2]+" Status "+status[i]);
        }
    }
}

