package com.gla.String.level02;
import java.util.Scanner;
public class TrimWithCharAt {
    static int[] trimIndex(String s){
        int start=0,end=s.length()-1;
        while(s.charAt(start)==' ') start++;
        while(s.charAt(end)==' ') end--;
        return new int[]{start,end+1};
    }
    static String sub(String s,int a,int b){
        String r="";
        for(int i=a;i<b;i++) r+=s.charAt(i);
        return r;
    }
    static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++)
            if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] idx=trimIndex(s);
        String m=sub(s,idx[0],idx[1]);
        String b=s.trim();

        System.out.println("Same? "+compare(m,b));
    }
}

