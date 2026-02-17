package com.gla.classesAndobjects.level02;
import java.util.Scanner;
class ArrayCheck{
    public static boolean isPositive(int n){return n>=0;}
    public static boolean isEven(int n){return n%2==0;}
    public static int compare(int a,int b){
        if(a>b)return 1;
        if(a==b)return 0;
        return-1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]a=new int[5];
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            if(isPositive(a[i])){
                if(isEven(a[i]))System.out.println("Positive Even");
                else System.out.println("Positive Odd");
            }else System.out.println("Negative");
        }
        int r=compare(a[0],a[4]);
        if(r==1)System.out.println("First Greater");
        else if(r==0)System.out.println("Equal");
        else System.out.println("First Less");
    }
}

