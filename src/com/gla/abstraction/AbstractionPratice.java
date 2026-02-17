package com.gla.abstraction;
 abstract class Fruit {
     abstract void test();
     public void colour(){
         System.out.println("Yellow");
     }
 }
 class mango extends Fruit{

     @Override
     void test() {
         System.out.println("Test is Sweet");
     }
 }


public class AbstractionPratice {
    public static void main(String[] args){
        mango m1 = new mango();
        m1.test();
    }
 }

