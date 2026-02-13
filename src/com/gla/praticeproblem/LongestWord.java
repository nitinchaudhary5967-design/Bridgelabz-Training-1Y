package com.gla.String.PracticeProblems;
import java.util.*;
class LongestWord{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String[] w=sc.nextLine().split(" ");
        String max="";
        for(String x:w) {
            if (x.length() > max.length()) {
                max = x;
            }
        }
        System.out.println(max);
    }
}

