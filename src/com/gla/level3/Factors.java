package com.gla.classesAndobjects.level03;
import java.util.*;
public class Factors{
    static int[]factors(int n){
        int c=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                c++;
        int[]a=new int[c];
        int k=0;
        for(int i=1;i<=n;i++)
            if(n%i==0)
                a[k++]=i;
        return a;
    }
    static int greatest(int[]a){
        return a[a.length-1];
    }
    static int sum(int[]a){
        int s=0;
        for(int i:a)
            s+=i;
        return s;
    }
    static int product(int[]a){
        int p=1;
        for(int i:a)
            p*=i;
        return p;
    }
    static int cubeProduct(int[]a){
        int p=1;
        for(int i:a)p*=Math.pow(i,3);
        return p;}
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=factors(n);
        System.out.println("Greatest:"+greatest(a));
        System.out.println("Sum:"+sum(a));
        System.out.println("Product:"+product(a));
        System.out.println("CubeProduct:"+cubeProduct(a));
    }
}

