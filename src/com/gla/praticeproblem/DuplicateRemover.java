package com.gla.String.PracticeProblems;
import java.util.*;
public class DuplicateRemover {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String r="";
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(r.indexOf(ch)==-1)
                    r+=ch;
            }
            System.out.println(r);
        }
}


