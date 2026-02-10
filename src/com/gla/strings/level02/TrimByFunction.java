package com.gla.String.level02;
import java.util.Scanner;
public class TrimByFunction {
    static String myTrim(String s){
        int start=0,end=s.length()-1;
        while(start<s.length()&&s.charAt(start)==' ') start++;
        while(end>=0&&s.charAt(end)==' ') end--;
        String result="";
        for(int i=start;i<=end;i++)
            result+=s.charAt(i);
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t1=myTrim(s);
        String t2=s.trim();
        System.out.println("Both Same? "+t1.equals(t2));
    }
}


