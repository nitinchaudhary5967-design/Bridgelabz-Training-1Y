package com.gla.FunctionalInterfaces;
public class JobExecution{
    public static void main(String[]args){
        Runnable r=()->System.out.println("Background task running");
        Thread t=new Thread(r);
        t.start();
    }
}
