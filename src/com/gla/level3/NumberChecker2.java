package com.gla.classesAndobjects.level03;
import java.util.*;
public class NumberChecker2{
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
    static int sum(int[]a){
        int s=0;
        for(int i:a)
            s+=i;
        return s;
    }
    static int sumSq(int[]a){
        int s=0;
        for(int i:a)
            s+=Math.pow(i,2);
        return s;
    }
    static boolean harshad(int n,int[]a){
        return n%sum(a)==0;
    }
    static void freq(int[]a){
        int[][]f=new int[10][2];
        for(int i=0;i<10;i++)
            f[i][0]=i;
        for(int i:a)
            f[i][1]++;
        for(int i=0;i<10;i++)
            if(f[i][1]>0)
            System.out.println(f[i][0]+"->"+f[i][1]);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=digits(n);
        System.out.println("Sum:"+sum(a));
        System.out.println("SumSquares:"+sumSq(a));
        System.out.println("Harshad:"+harshad(n,a));
        freq(a);
    }
}

