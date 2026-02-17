package com.gla.classesAndobjects.level02;
import java.util.*;
class UnitConverter{
    public static double convertKmToMiles(double km){
        return km*0.621371;
    }
    public static double convertMilesToKm(double m){
        return m*1.60934;
    }
    public static double convertMetersToFeet(double m){
        return m*3.28084;
    }
    public static double convertFeetToMeters(double f) {
        return f*0.3048;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double v=sc.nextDouble();
        System.out.println("KmToMiles "+convertKmToMiles(v));
        System.out.println("MilesToKm "+convertMilesToKm(v));
        System.out.println("MetersToFeet "+convertMetersToFeet(v));
        System.out.println("FeetToMeters "+convertFeetToMeters(v));
    }
}


