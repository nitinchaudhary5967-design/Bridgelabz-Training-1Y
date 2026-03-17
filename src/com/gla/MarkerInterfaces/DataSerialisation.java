package com.gla.MarkerInterfaces;
interface Backup{}
class Data implements Backup{
    String name="File1";
}
public class DataSerialisation{
    public static void main(String[]args){
        Data d=new Data();
        if(d instanceof Backup)System.out.println("Backup allowed");
    }
}
