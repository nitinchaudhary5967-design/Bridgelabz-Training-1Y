package com.gla.packagesQuestions.Q7.com.bank.util;

public class Main {
    public static void main(String[] args){
        InterestCalculator i=new InterestCalculator();
        System.out.println("SI:"+i.calculateSimpleInterest(1000,5,2));
        System.out.println("CI:"+i.calculateCompoundInterest(1000,5,2));
    }
}
