package com.gla.MarkerInterfaces;
class Student implements Cloneable{
    int id=1;
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
public class CloningProtoType{
    public static void main(String[]args)throws Exception{
        Student s1=new Student();
        Student s2=(Student)s1.clone();
        System.out.println(s2.id);
    }
}
