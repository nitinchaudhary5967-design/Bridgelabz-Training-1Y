package com.gla.ProblemStatements;
import java.util.*;
class MaxOfThree{
    static int max(int a,int b,int c){
        if(a>=b&&a>=c)return a;
        else if(b>=c)return b;
        else return c;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println("Maximum: "+max(a,b,c));
    }
}

