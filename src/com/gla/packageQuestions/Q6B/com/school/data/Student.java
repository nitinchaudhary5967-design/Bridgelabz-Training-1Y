package com.gla.packagesQuestions.Q6B.com.school.data;
public class Student{
    String name;
    public int m1;
    public int m2;
    public int m3;
    public Student(String n,int a,int b,int c){
        name=n;
        m1=a;
        m2=b;
        m3=c;
    }
    public String toString(){
        return name+" "+m1+" "+m2+" "+m3;
    }
}
