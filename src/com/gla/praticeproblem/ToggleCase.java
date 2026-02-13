package com.gla.String.PracticeProblems;
import java.util.*;
class ToggleCase{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&&ch<='z'){
                r+=(char)(ch-32);
            }
            else if(ch>='A'&&ch<='Z'){
                r+=(char)(ch+32);
            }
            else{
                r+=ch;
            }
        }
        System.out.println(r);
    }
}

