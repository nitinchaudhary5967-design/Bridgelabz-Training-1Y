package com.gla.classesAndobjects.level01;
import java.util.Scanner;
class Chocolates{
    public static int[]RemainderAndQuotient(int n,int d){
        return new int[]{n/d,n%d};
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[]r=RemainderAndQuotient(n,m);
        System.out.println("Each child gets "+r[0]+" Remaining "+r[1]);
    }
}

