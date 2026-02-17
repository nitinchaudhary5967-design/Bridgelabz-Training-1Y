package com.gla.classesAndobjects.level02;
import java.util.Scanner;
class SumRecursion{
    public static int sumRec(int n){
        if(n==1)return 1;
        return n+sumRec(n-1);
    }
    public static int sumFormula(int n){
        return n*(n+1)/2;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)return;
        int r1=sumRec(n);
        int r2=sumFormula(n);
        System.out.println("Recursive "+r1);
        System.out.println("Formula "+r2);
        if(r1==r2)System.out.println("Both are equal");
    }
}

