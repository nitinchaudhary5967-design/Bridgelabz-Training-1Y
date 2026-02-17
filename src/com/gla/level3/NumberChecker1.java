package com.gla.classesAndobjects.level03;
import java.util.*;
public class NumberChecker1{
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
    static boolean duck(int[]a){
        for(int i:a)
            if(i==0)
                return true;
        return false;
    }
    static boolean armstrong(int n,int[]a){
        int s=0,p=a.length;
        for(int i:a)
            s+=Math.pow(i,p);
        return s==n;
    }
    static void largest(int[]a){
        int l=Integer.MIN_VALUE,sl=Integer.MIN_VALUE;
        for(int i:a){
            if(i>l){
                sl=l;
                l=i;
            }
            else if(i>sl&&i!=l)
                sl=i;
        }
        System.out.println("Largest:"+l+" SecondLargest:"+sl);}
    static void smallest(int[]a){
        int s=Integer.MAX_VALUE,ss=Integer.MAX_VALUE;
        for(int i:a){
            if(i<s){
                ss=s;
                s=i;
            }
            else if(i<ss&&i!=s)
                ss=i;
        }
        System.out.println("Smallest:"+s+" SecondSmallest:"+ss);}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=digits(n);
        System.out.println("Digits:"+count(n));
        System.out.println("Duck:"+duck(a));
        System.out.println("Armstrong:"+armstrong(n,a));
        largest(a);
        smallest(a);
    }
}

