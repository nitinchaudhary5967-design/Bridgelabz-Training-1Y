package com.gla.classesAndobjects.level03;
import java.util.*;
public class NumberChecker3{
    static int count(int n){
        int c=0;
        while(n>0){
            c++;
            n/=10;
        }
        return c;
    }
    static int[]digits(int n){
        int c=count(n);
        int[] a=new int[c];
        for(int i=c-1;i>=0;i--){
            a[i]=n%10;
            n/=10;
        }
        return a;
    }
    static int[]reverse(int[]a){
        int[]b=new int[a.length];
        for(int i=0;i<a.length;i++)
            b[i]=a[a.length-1-i];
        return b;
    }
    static boolean equal(int[]a,int[]b){
        if(a.length!=b.length)
            return false;
        for(int i=0;i<a.length;i++)
            if(a[i]!=b[i])
                return false;
        return true;
    }
    static boolean duck(int[]a){
        for(int i:a)
            if(i==0)
                return true;
        return false;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=digits(n);
        int[]b=reverse(a);
        System.out.println("Palindrome:"+equal(a,b));
        System.out.println("Duck:"+duck(a));
    }
}

