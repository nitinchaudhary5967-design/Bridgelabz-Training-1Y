package com.gla.String.PracticeProblems;
import java.util.*;
class FrequentCharacters{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int max=0;
        char res=' ';
        for(int i=0;i<s.length();i++){
            int c=0;
            for(int j=0;j<s.length();j++)
                if(s.charAt(i)==s.charAt(j))c++;
            if(c>max)
            {
                max=c;res=s.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: '"+res+"'");
    }
}

