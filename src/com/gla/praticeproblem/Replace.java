package com.gla.String.PracticeProblems;
import java.util.*;
class Replace{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String old=sc.next();
        String nw=sc.next();
        System.out.println(s.replace(old,nw));
    }
}

