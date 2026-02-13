package com.gla.String.PracticeProblems;
import java.util.*;
class Anagram{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        if(s1.length()!=s2.length())
        {
            System.out.println("Not Anagram");
            return;
        }
        int[] a=new int[256];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)]++;
            a[s2.charAt(i)]--;
        }
        for(int x:a)if(x!=0){System.out.println("Not Anagram");return;}
        System.out.println("Anagram");
    }
}

