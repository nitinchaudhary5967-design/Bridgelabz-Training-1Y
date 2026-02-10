package com.gla.String.level02;
import java.util.Scanner;
public class StringLength {
    static int myLength(String s){
        int count=0;
        try{
            for(;;){
                s.charAt(count);
                count++;
            }
        }catch(Exception e){
            return count;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println("User Method Length: "+myLength(s));
        System.out.println("Built-in Length: "+s.length());
    }
}

