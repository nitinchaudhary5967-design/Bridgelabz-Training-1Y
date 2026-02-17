package com.gla.classesAndobjects.level03;
import java.util.*;
public class MatrixAdvanced{
    static int[][]create(int n){
        int[][]a=new int[n][n];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                a[i][j]=(int)(Math.random()*9)+1;
        return a;
    }
    static void print(int[][]a){
        for(int[]r:a){
            for(int v:r)
                System.out.print(v+" ");
            System.out.println();
        }
    }
    static void printD(double[][]a){
        for(double[]r:a){
            for(double v:r)
                System.out.print(v+" ");
            System.out.println();
        }
    }
    static int det2(int[][]a){
        return a[0][0]*a[1][1]-a[0][1]*a[1][0];
    }
    static int det3(int[][]a){
        return a[0][0]*(a[1][1]*a[2][2]-a[1][2]*a[2][1])
                -a[0][1]*(a[1][0]*a[2][2]-a[1][2]*a[2][0])
                +a[0][2]*(a[1][0]*a[2][1]-a[1][1]*a[2][0]);
    }
    static double[][]inv2(int[][]a){
        double det=det2(a);
        double[][]b=new double[2][2];
        b[0][0]=a[1][1]/det;
        b[0][1]=-a[0][1]/det;
        b[1][0]=-a[1][0]/det;
        b[1][1]=a[0][0]/det;
        return b;
    }
    static double[][]inv3(int[][]a){
        double det=det3(a);
        double[][]b=new double[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int[][]m=new int[2][2];
                int r=0;
                for(int x=0;x<3;x++){
                    if(x==i)continue;
                    int c=0;
                    for(int y=0;y<3;y++){
                        if(y==j)continue;
                        m[r][c++]=a[x][y];
                    }
                    r++;
                }
                int co=((i+j)%2==0?1:-1)*det2(m);
                b[j][i]=co/det;
            }
        }
        return b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]A=create(n);
        System.out.println("Matrix");print(A);
        if(n==2){
            int d=det2(A);
            System.out.println("Determinant:"+d);
            if(d!=0){System.out.println("Inverse");printD(inv2(A));}
            else System.out.println("Inverse not possible");
        }
        if(n==3){
            int d=det3(A);
            System.out.println("Determinant:"+d);
            if(d!=0){System.out.println("Inverse");printD(inv3(A));}
            else System.out.println("Inverse not possible");
        }
    }
}
