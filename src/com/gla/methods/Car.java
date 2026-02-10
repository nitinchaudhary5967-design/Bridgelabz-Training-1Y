package com.gla.methods;

public class Car{
    String color;
    int model;
    String type;
    static String company="LC300";


    public static void main(){

        Car s1=new Car();
        s1.color="Black";
        s1.model=2026;
        s1.type="SUV";


        System.out.println(s1.color);
        System.out.println(s1.model);
        System.out.println(s1.type);
        System.out.println(Car.company);



    }
}