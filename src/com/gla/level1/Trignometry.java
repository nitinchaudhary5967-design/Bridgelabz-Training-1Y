package com.gla.classesAndobjects.level01;
import java.util.Scanner;
class Trignometry{
    public static double[]TrigonometricFunctions(double a){
        double r=Math.toRadians(a);
        return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double[]r=TrigonometricFunctions(a);
        System.out.println("Sin "+r[0]+" Cos "+r[1]+" Tan "+r[2]);
    }
}

