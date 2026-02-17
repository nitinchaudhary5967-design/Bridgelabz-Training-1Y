package com.gla.Polymorphism;

public class Runner {
    public static void main(String[] args){
        Calculator c = new Calculator();
        int sum1 =c.add(34,12);
        System.out.println(sum1);
        double sum2 =c.add(11.25,13.75);
        System.out.println(sum2);
    }
}
