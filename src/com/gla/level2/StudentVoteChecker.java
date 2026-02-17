package com.gla.classesAndobjects.level02;
import java.util.Scanner;
class StudentVoteChecker{
    public static boolean canStudentVote(int age){
        if(age<0)return false;
        return age>=18;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int[]a=new int[10];
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
            System.out.println(canStudentVote(a[i]));
        }
    }
}

