package com.gla.classesAndobjects.level01;
import java.util.Scanner;
class Rounds{
    public static double calculate(double a,double b,double c){
        double p=a+b+c;
        return 5000/p;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        System.out.println(calculate(a,b,c));
    }
}
