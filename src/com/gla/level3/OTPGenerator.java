package com.gla.classesAndobjects.level03;
import java.util.*;
public class OTPGenerator{
    static int generate(){
        return (int)(Math.random()*900000)+100000;
    }
    static boolean unique(int[]a){
        for(int i=0;i<a.length;i++)
            for(int j=i+1;j<a.length;j++)
                if(a[i]==a[j])
                    return false;
        return true;
    }
    public static void main(String[]args){
        int[]a=new int[10];
        for(int i=0;i<10;i++)
            a[i]=generate();
        for(int i:a)
            System.out.println(i);
        System.out.println("AllUnique:"+unique(a));
    }
}

