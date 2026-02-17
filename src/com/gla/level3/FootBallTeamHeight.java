package com.gla.classesAndobjects.level03;
import java.util.*;
public class FootBallTeamHeight{
    static int sum(int[]a){
        int s=0;
        for(int i:a)
            s+=i;
        return s;
    }
    static double mean(int[]a){
        return (double)sum(a)/a.length;
    }
    static int min(int[]a){
        int m=a[0];
        for(int i:a)
            if(i<m)
                m=i;
        return m;
    }
    static int max(int[]a){
        int m=a[0];
        for(int i:a)
            if(i>m)
                m=i;
        return m;
    }
    public static void main(String[]args){
        int[]heights=new int[11];
        for(int i=0;i<11;i++)
            heights[i]=(int)(Math.random()*101)+150;
        System.out.println("Heights:");
        for(int i:heights)
            System.out.print(i+" ");
        System.out.println("\nShortest:"+min(heights));
        System.out.println("Tallest:"+max(heights));
        System.out.println("Mean:"+mean(heights));
    }
}

