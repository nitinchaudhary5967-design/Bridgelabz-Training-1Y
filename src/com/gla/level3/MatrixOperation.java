package com.gla.classesAndobjects.level03;
import java.util.*;
public class MatrixOperation{
    static int[][]create(int r,int c){
        int[][]a=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                a[i][j]=(int)(Math.random()*10);
        return a;
    }
    static int[][]add(int[][]a,int[][]b){
        int r=a.length,c=a[0].length;
        int[][]res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                res[i][j]=a[i][j]+b[i][j];
        return res;
    }
    static int[][]sub(int[][]a,int[][]b){
        int r=a.length,c=a[0].length;
        int[][]res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                res[i][j]=a[i][j]-b[i][j];
        return res;
    }
    static int[][]mul(int[][]a,int[][]b){
        int r=a.length,c=b[0].length,n=b.length;
        int[][]res=new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                for(int k=0;k<n;k++)
                    res[i][j]+=a[i][k]*b[k][j];
        return res;
    }
    static void print(int[][]a){
        for(int[]r:a){
            for(int v:r)
                System.out.print(v+" ");
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt(),c=sc.nextInt();
        int[][]A=create(r,c);
        int[][]B=create(r,c);
        System.out.println("Matrix A");
        print(A);
        System.out.println("Matrix B");
        print(B);
        System.out.println("Addition");
        print(add(A,B));
        System.out.println("Subtraction");
        print(sub(A,B));
        System.out.println("Multiplication");
        print(mul(A,B));
    }
}

